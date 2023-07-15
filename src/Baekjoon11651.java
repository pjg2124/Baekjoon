import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[][] position = new Integer[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            position[i][0] = Integer.parseInt(st.nextToken());
            position[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(position, (a, b) -> {
            if (a[1].equals(b[1])) return a[0] - b[0];
            else return a[1] - b[1];
        });

        for (int i = 0; i < N; i++) {
            System.out.println(position[i][0] + " " + position[i][1]);
        }
    }
}