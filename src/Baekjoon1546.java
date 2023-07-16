import java.util.Scanner;

public class Baekjoon1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        double max = 0;
        double result = 0;

        for (int i =0; i< N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) max = arr[i];
        }

        for (int i =0; i< N; i++) {
            result += arr[i] * 100 / max;
        }

        System.out.println(result/N);
    }
}
