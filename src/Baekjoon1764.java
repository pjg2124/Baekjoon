import java.io.*;
import java.util.*;

public class Baekjoon1764 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), 1);
        }

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (map.getOrDefault(str, 0) == 1) {
                list.add(str);
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
