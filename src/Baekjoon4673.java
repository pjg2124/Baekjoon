public class Baekjoon4673 {
    public static void main(String[] args) {
        boolean[] bArr = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            bArr[d(i)] = true;
        }

        for (int i = 1; i <= 10000; i++) {
            if (!bArr[i]) {
                System.out.println(i);
            }
        }

    }

    public static int d(int num) {
        int result = num;

        while(true) {
            result = result + (num % 10);
            if(num < 10) break;
            num /= 10;
        }

        if (result > 10000) return 0;


        return result;
    }
}
