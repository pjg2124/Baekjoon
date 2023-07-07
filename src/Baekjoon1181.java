import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] strArr = new String[N];
        String tmp = new String();

        for (int i = 0; i < N; i++) {
            strArr[i] = sc.next();
        }

        Arrays.sort(strArr, (s1, s2) -> {
            if (s1.length() == s2.length()) return s1.compareTo(s2);
            return Integer.compare(s1.length(), s2.length());
        });

        for (int i = 0; i < N; i++) {
            if (strArr[i].equals(tmp)) continue;
            tmp = strArr[i];
            System.out.println(strArr[i]);
        }
    }
}