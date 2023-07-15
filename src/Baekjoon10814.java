import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baekjoon10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] person = new String[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            person[i][0] = st.nextToken();
            person[i][1] = st.nextToken();
        }

        Arrays.sort(person, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                Integer a = Integer.parseInt(o1[0]);
                Integer b = Integer.parseInt(o2[0]);
                return a - b;
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(person[i][0] + " " + person[i][1]);
        }

    }
}