import java.util.Scanner;

public class Baekjoon15650 {
    public static int N;
    public static int M;
    public static int[] arr = new int[8];
    public static boolean[] checkNum = new boolean[8];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        dfs(0,0);
    }

    public static void dfs(int start, int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < N; i++) {
            if (!checkNum[i]) {
                arr[depth] = i + 1;
                checkNum[i] = true;
                dfs(start, depth + 1);
                checkNum[i] = false;
            }
            start++;
        }

    }
}
