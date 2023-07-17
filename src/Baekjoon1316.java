import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Baekjoon1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (isGroup(word)) cnt++;
        }

        System.out.println(cnt);
    }

    public static boolean isGroup(String word) {
        boolean[] b = new boolean[26];

        for (int i = 0; i < word.length(); i++) {
            if (b[word.charAt(i)-'a'])
                return false;
            if (i == word.length()-1) {
                continue;
            }
            if (word.charAt(i) == word.charAt(i+1))
                continue;
            b[word.charAt(i)-'a'] = true;

        }

        return true;
    }
}
