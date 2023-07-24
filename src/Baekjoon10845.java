import java.io.*;
import java.util.*;

public class Baekjoon10845 {
    static int[] queue = new int[100000];
    static int front = 0;
    static int back = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
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
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
            }
        }
    }

    public static void push(int x) {
        queue[back++] = x;
    }

    public static void pop() {
        if (front >= back) {
            System.out.println("-1");
        } else {
            System.out.println(queue[front]);
            queue[front++] = 0;
        }
    }

    public static void size() {
        System.out.println(back-front);
    }

    public static void empty() {
        if (front >= back) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static void front() {
        if (front >= back) {
            System.out.println("-1");
        } else {
            System.out.println(queue[front]);
        }
    }

    public static void back() {
        if (front >= back) {
            System.out.println("-1");
        } else {
            System.out.println(queue[back-1]);
        }
    }
}
