import java.io.*;
import java.util.*;

public class Baekjoon2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nodes = Integer.parseInt(br.readLine());
        int edges = Integer.parseInt(br.readLine());

        int[][] matrix = new int[nodes+1][nodes+1];
        for (int i = 1; i <= edges; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            matrix[n][m] = matrix[m][n] = 1;
        }

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visit = new boolean[nodes+1];
        queue.offer(1);
        visit[1] = true;
        int cnt = 0;
        while (!queue.isEmpty()) {
            int n = queue.poll();
            for (int i = 1; i <= nodes; i++) {
                if (matrix[n][i] == 1 && !visit[i]) {
                    queue.offer(i);
                    visit[i] = true;
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
