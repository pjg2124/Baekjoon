import java.util.Scanner;

public class Baekjoon1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int diagonalNum = 1;

        while (X > diagonalNum) {
            X -= diagonalNum;
            diagonalNum++;
        }

        diagonalNum++;

        if (diagonalNum % 2 == 1) {
            System.out.printf("%d/%d", X, diagonalNum-X);
        } else {
            System.out.printf("%d/%d", diagonalNum-X, X);
        }
    }
}