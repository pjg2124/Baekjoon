import java.util.*;

public class Baekjoon1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int num = 1;
        boolean possible = true;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            while (num <= input) {
                stack.push(num++);
                sb.append("+\n");
            }
            if (stack.peek() == input) {
                stack.pop();
                sb.append("-\n");
            } else {
                possible = false;
                break;
            }
        }

        if (possible) System.out.println(sb);
        else System.out.println("NO");
    }
}
