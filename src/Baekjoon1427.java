import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            list.add(num % 10);
            if (num < 10) break;
            num /= 10;
        }

        Collections.sort(list, (a, b) -> a < b ? 1 : (a == b ? 0 : -1));

        for (int i : list) {
            sb.append(i);
        }
        System.out.println(sb);
    }
}
