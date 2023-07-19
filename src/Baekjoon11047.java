import java.util.Scanner;

public class Baekjoon11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        int coin = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = N - 1; i >= 0; i--) {
            if (K >= arr[i]) {
                coin += K / arr[i];
                K %= arr[i];
            }
        }

        System.out.println(coin);
    }
}
