import java.util.*;

public class Baekjoon1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arrA = new int[N];
        int[] arrB = new int[N];

        for (int i = 0; i < N; i++) {
            arrA[i] = sc.nextInt();
        }
        Arrays.sort(arrA);

        for (int i = 0; i < N; i++) {
            arrB[i] = sc.nextInt();
        }
        Arrays.sort(arrB);

        int sum = 0;
        for (int i = 0; i < N; i++) {
           sum += arrA[i] * arrB[N-i-1];
        }

        System.out.println(sum);
    }
}
