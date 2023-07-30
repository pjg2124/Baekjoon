import java.util.Scanner;

public class Baekjoon1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        boolean[] primeNum = new boolean[N + 1];

        primeNum[0] = true;
        primeNum[1] = true;
        for (int i = 2; i < M; i++) {
            primeNum[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            for (int j = i * 2; j < primeNum.length; j += i) {
                primeNum[j] = true;
            }
        }

        for (int i = M; i < primeNum.length; i++) {
            if (!primeNum[i]) System.out.println(i);
        }
    }
}
