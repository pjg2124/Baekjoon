import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1002 {
    public static BufferedReader br;
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            System.out.println(check());
        }
    }

    public static int check() throws IOException {
        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int r1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        int r2 = Integer.parseInt(st.nextToken());

        int distance = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (x1 == x2 && y1 == y2) {
            if (r1 == r2) return -1;
            else return 0;
        } else {
            if (distance == Math.pow(r1+r2, 2)) return 1;
            else if (distance > Math.pow(r1+r2, 2)) return 0;
            else {
                if (distance == Math.pow(r2-r1, 2)) return 1;
                else if (distance < Math.pow(r2-r1, 2)) return 0;
                else return 2;
            }
        }

    }
}

