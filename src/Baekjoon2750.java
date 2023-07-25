import java.util.Scanner;

public class Baekjoon2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] bubbleSortArray = new int[N];

        for (int i = 0; i < N; i++) {
            bubbleSortArray[i] = sc.nextInt();
        }

        for (int i = 0; i < bubbleSortArray.length-1; i++) {
            int check = 0;
            for (int j = 0; j < bubbleSortArray.length-i-1; j++) {
                if (bubbleSortArray[j] > bubbleSortArray[j+1]) {
                    int tmp = bubbleSortArray[j];
                    bubbleSortArray[j] = bubbleSortArray[j+1];
                    bubbleSortArray[j+1] = tmp;
                    check++;
                }
            }
            if (check == 0) break;
        }

        for (int i = 0; i < bubbleSortArray.length; i++) {
            System.out.println(bubbleSortArray[i]);
        }
    }
}
