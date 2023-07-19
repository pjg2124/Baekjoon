import java.util.Scanner;
import java.util.Arrays;

public class Baekjoon1940 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int start = 0, end = N - 1, cnt = 0;

        while (arr[start] < arr[end]) {
            if (arr[start] + arr[end] < M) start++;
            else if (arr[start] + arr[end] > M) end--;
            else {
                end--;
                start++;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
