import java.util.Scanner;

public class Baekjoon2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        boolean b = true;

        while (N > 0) {
            if (N % 5 == 0) {
                N -=5;
                cnt++;
            } else if (N < 3) {
                b = false;
                break;
            } else {
                N -= 3;
                cnt++;
            }
        }

        if (b) System.out.println(cnt);
        else System.out.println("-1");

    }
}