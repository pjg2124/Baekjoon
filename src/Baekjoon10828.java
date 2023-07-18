import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10828 {
    static int[] stack = new int[10000];
    static int top = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);

            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "top":
                    top();
                    break;
            }
        }
    }

    public static void push(int x) {
        stack[top] = x;
        top++;
    }

    public static void pop() {
        if (top == 0) System.out.println("-1");
        else {
            System.out.println(stack[top-1]);
            stack[top-1] = 0;
            top--;
        }
    }

    public static void size() {
        System.out.println(top);
    }

    public static void empty() {
        if (top == 0) System.out.println("1");
        else System.out.println("0");

    }

    public static void top() {
        if (top == 0) System.out.println("-1");
        else System.out.println(stack[top-1]);
    }
}
