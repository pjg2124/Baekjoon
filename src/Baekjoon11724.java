import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon11724 {
    public static int[][] graph;
    public static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        graph = new int[N+1][N+1];
        visit = new boolean[N+1];

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            graph[n][m] = graph[m][n] = 1;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visit[1] = true;
        int cnt = 0;
        while (true) {
            while (!queue.isEmpty()) {
                int n = queue.poll();
                for (int i = 1; i <= N; i++) {
                    if (graph[n][i] == 1 && !visit[i]) {
                        queue.offer(i);
                        visit[i] = true;
                        cnt++;
                    }
                }
            }

            if (queue.peek() == N) break;
        }

        System.out.println(cnt);
    }
}
