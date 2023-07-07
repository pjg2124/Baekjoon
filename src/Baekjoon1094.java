import java.util.Scanner;
public class Baekjoon1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num);
        int cnt = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') cnt++;
        }

        System.out.println(cnt);
    }
}
