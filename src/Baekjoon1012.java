import java.io.*;
import java.util.*;

public class Baekjoon1012 {
    public static int[][] map;
    public static boolean[][] visit;
    public static int M;
    public static int N;
    public static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            map = new int[M][N];
            visit = new boolean[M][N];

            while (K-- > 0) {
                st = new StringTokenizer(br.readLine());
                int row = Integer.parseInt(st.nextToken());
                int col = Integer.parseInt(st.nextToken());
                map[row][col] = 1;
            }

            int cnt = 0;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (map[i][j] == 1 && !visit[i][j]) {
                        cnt++;
                        bfs(i, j);
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        visit[x][y] = true;
        queue.offer(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] position = queue.poll();

            for (int i = 0; i < 4; i++) {
                int tmpX = position[0] + dx[i];
                int tmpY = position[1] + dy[i];

                if (tmpX >= 0 && tmpX < M && tmpY >= 0 && tmpY < N) {
                    if (map[tmpX][tmpY] == 1 && !visit[tmpX][tmpY]) {
                        queue.offer(new int[]{tmpX, tmpY});
                        visit[tmpX][tmpY] = true;
                    }
                }
            }
        }
    }
}
