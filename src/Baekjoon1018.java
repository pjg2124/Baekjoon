import java.util.Scanner;

public class Baekjoon1018 {
    public static boolean[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        board = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    board[i][j] = true;
                }
            }
        }

        int rowCnt = N - 7;
        int colCnt = M - 7;
        int min = 64;

        for (int i = 0; i < rowCnt; i++) {
            for (int j = 0; j < colCnt; j++) {
                int result = findChessBoard(i, j);
                if (result < min) {
                    min = result;
                }
            }
        }

        System.out.println(min);
    }

    public static int findChessBoard(int n, int m) {
        int cnt = 0;
        boolean check = board[n][m];

        for (int i = n; i < n+8; i++) {
            for (int j = m; j < m+8; j++) {
                if (check != board[i][j]) {
                    cnt++;
                }
                check = !check;
            }
            check = !check;
        }

        return Math.min(cnt, 64 - cnt);
    }
}
