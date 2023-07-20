import java.io.*;
import java.util.*;

public class Baekjoon12891 {
    public static char[] DNA = {'A', 'C', 'G', 'T'};
    public static HashMap<Character, Integer> checkDna = new HashMap<>();
    public static HashMap<Character, Integer> passwordDna = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] inputDna = br.readLine().toCharArray();
        int result = 0;

        st = new StringTokenizer(br.readLine());
        for (char c : DNA)
            checkDna.put(c, Integer.parseInt(st.nextToken()));

        for (int i = 0; i < P; i++)
            passwordDna.put(inputDna[i], passwordDna.getOrDefault(inputDna[i], 0)+1);
        result += PasswordCount();

        for (int i = 0; i < S-P; i++) {
            int j = P+i;
            passwordDna.put(inputDna[i], passwordDna.getOrDefault(inputDna[i], 0)-1);
            passwordDna.put(inputDna[j], passwordDna.getOrDefault(inputDna[j], 0)+1);
            result += PasswordCount();
        }
        System.out.println(result);
    }

    public static int PasswordCount () {
        int cnt = 0;
        for (char c : DNA)
            if (checkDna.getOrDefault(c, 0) <= passwordDna.getOrDefault(c, 0)) cnt++;

        if (cnt == 4) return 1;
        else return 0;
    }
}
