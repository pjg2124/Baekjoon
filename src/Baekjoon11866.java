import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        sb.append("<");

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        while (!list.isEmpty()) {
            idx += K-1;
            idx %= list.size();
            sb.append(list.get(idx)).append(", ");
            list.remove(idx);
        }

        sb.delete(sb.length()-2, sb.length()).append(">");

        System.out.println(sb);

    }
}
