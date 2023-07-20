import java.util.*;

public class Baekjoon2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++)
            q.add(i);

        int idx = 0;
        while (!(q.size() == 1)) {
            if (idx % 2 == 1) q.offer(q.poll());
            else q.remove();
            idx++;
        }

        System.out.println(q.poll());
    }
}
