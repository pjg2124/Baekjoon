import java.util.PriorityQueue;
import java.util.Scanner;

public class Baekjoon11286 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueueQue = new PriorityQueue<>((o1, o2) -> {
            if (Math.abs(o1) == Math.abs(o2)) return o1 > o2 ? 1 : -1;
            else return Math.abs(o1) - Math.abs(o2);
        });

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                if (priorityQueueQue.isEmpty()) System.out.println("0");
                else System.out.println(priorityQueueQue.poll());
            } else {
                priorityQueueQue.offer(x);
            }
        }
    }
}
