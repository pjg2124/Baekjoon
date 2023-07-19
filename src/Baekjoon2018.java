import java.util.Scanner;

public class Baekjoon2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 1, start = 1, end = 1, cnt = 1;

        while (end != N) {
            if (N > sum) sum += ++end;
            else if (N < sum) sum -= start++;
            else {
                cnt++;
                sum += ++end;
            }
        }

        System.out.println(cnt);
    }
}
