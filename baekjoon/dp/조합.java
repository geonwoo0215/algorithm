package dp;

import java.math.BigInteger;
import java.util.Scanner;

public class 조합 {

    private static final Integer SIZE = 101;

    private static final BigInteger[][] arr = new BigInteger[SIZE][SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = BigInteger.valueOf(1);
                }
                else arr[i][j] = arr[i - 1][j - 1].add(arr[i - 1][j]);
            }
        }

//        BigInteger ans = dp(n, m);

        System.out.println(arr[n][m]);

    }

    public static BigInteger dp(int n, int m) {

        if (arr[n][m] == null) {
            if (m == 0 || m == n) {
                arr[n][m] = BigInteger.valueOf(1);
            }
            else arr[n][m] = dp(n - 1, m - 1).add(dp(n - 1, m));
        }

        return arr[n][m];

    }
}
