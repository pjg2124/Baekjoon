import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arrN = new int[N];
        boolean b = false;

        for (int i = 0; i < N; i++) {
            arrN[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arrM = new int[M];

        for (int i = 0; i < M; i++) {
            arrM[i] = sc.nextInt();
        }

        Arrays.sort(arrN);

        for (int i = 0; i < M; i++) {
            if (Arrays.binarySearch(arrN, arrM[i]) >= 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }

        }

    }
}
