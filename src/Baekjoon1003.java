import java.util.Scanner;

public class Baekjoon1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arrN = new int[T];
        int[][] dp = new int[40][2];
        int maxNum = 0;

        for (int i = 0; i < T; i++) {
            arrN[i] = sc.nextInt();
            if (maxNum < arrN[i]) maxNum = arrN[i];
        }

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 2; i <= maxNum; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }

        for (int i = 0; i < T; i++) {
            System.out.println(dp[arrN[i]][0] + " " + dp[arrN[i]][1]);
        }

    }
}
