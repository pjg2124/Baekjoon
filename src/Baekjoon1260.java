import java.io.*;
import java.util.*;

public class Baekjoon1260 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int[][] graphs = new int[N + 1][N + 1];

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            graphs[n][m] = graphs[m][n] = 1;
        }

        dfs(graphs, N, V);
        bfs(graphs, N, V);

    }

    public static void dfs(int[][] graphs, int n, int v) {
        StringBuilder sb = new StringBuilder();
        boolean[] visit = new boolean[n + 1];
        Stack<Integer> stack = new Stack<>();

        stack.push(v);
        visit[v] = true;
        sb.append(v).append(" ");

        while (!stack.isEmpty()) {
            int s = stack.peek();
            for (int i = 1; i <= n; i++) {
                if (graphs[s][i] == 1 && !visit[i]) {
                    stack.push(i);
                    visit[i] = true;
                    sb.append(i).append(" ");
                    break;
                }
                if (i == n) stack.pop();
            }
        }

        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb);
    }

    public static void bfs(int[][] graphs, int n, int v) {
        StringBuilder sb = new StringBuilder();
        boolean[] visit = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(v);
        visit[v] = true;
        sb.append(v).append(" ");

        while (!queue.isEmpty()) {
            int q = queue.poll();
            for (int i = 1; i <= n; i++) {
                if (graphs[q][i] == 1 && !visit[i]) {
                    queue.offer(i);
                    visit[i] = true;
                    sb.append(i).append(" ");
                }
            }
        }

        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb);
    }
}
