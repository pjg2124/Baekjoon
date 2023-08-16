import java.util.Scanner;

public class Baekjoon2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] stairs = new int[size + 2];
        int[] dp = new int[size + 2];

        for (int i = 0; i < size; i++) {
            stairs[i] = sc.nextInt();
        }

        dp[0] = stairs[0];
        dp[1] = stairs[0] + stairs[1];
        dp[2] = Math.max(stairs[0] + stairs[2], stairs[1] + stairs[2]);

        for (int i = 3; i < size; i++) {
            dp[i] = Math.max(dp[i - 3] + stairs[i - 1], dp[i - 2]) + stairs[i];
        }

        System.out.println(dp[size - 1]);

    }
}
