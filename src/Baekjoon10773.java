import java.util.Scanner;
import java.util.Stack;

public class Baekjoon10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int K = sc.nextInt();
        int result = 0;

        for (int i = 0; i < K; i++) {
            int tmp = sc.nextInt();
            if (tmp == 0) {
                stack.pop();
            } else {
                stack.push(tmp);
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            result += stack.get(i);
        }

        System.out.println(result);
    }
}
