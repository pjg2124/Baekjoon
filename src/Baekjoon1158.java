import java.io.*;
import java.util.*;

public class Baekjoon1158 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        int cycle = 0;
        sb.append("<");
        while (!queue.isEmpty()) {
            if (cycle == K - 1) {
                sb.append(queue.poll() + ", ");
                cycle = 0;
            } else {
                queue.offer(queue.poll());
                cycle++;
            }
        }
        sb.delete(sb.length()-2, sb.length()).append(">");
        System.out.println(sb);
    }
}