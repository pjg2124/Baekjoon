import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            int cnt = 0;

            for (char c : str.toCharArray()) {
                if (c == '(') cnt++;
                else if (c == ')') cnt--;
                if (cnt < 0) break;
            }

            if (cnt == 0) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
