import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] myCard = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            myCard[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(myCard);


        int M = Integer.parseInt(br.readLine());
        int[] card = new int[M];
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            card[i] = Integer.parseInt(st2.nextToken());
        }

        for (int c : card) {
            if (Arrays.binarySearch(myCard, c) >= 0) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb);

    }
}
