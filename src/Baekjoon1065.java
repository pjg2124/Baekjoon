import java.util.Scanner;

public class Baekjoon1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 99;
        int a = 0;
        int b = 0;
        int c = 0;

        if (N < 100) {
            System.out.println(N);
        } else {
            for (int i = 100; i <= N; i++) {
                a = i / 100;
                b = (i % 100) / 10;
                c = i % 10;

                if ((a - b) == (b - c)) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

    }
}
