import java.util.Scanner;

public class Baekjoon1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double max = 0;
        double result = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            result += x;
            if (x > max) max = x;
        }

        System.out.println(result * 100 / N / max);
    }
}
