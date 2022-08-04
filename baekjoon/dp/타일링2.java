package dp;

import java.util.Scanner;

public class 타일링2 {

    private static final Integer SIZE = 1001;
    private static final int[] arr = new int[SIZE];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        arr[1] = 1;
        arr[2] = 3;

        for (int i = 3; i <= n; i++) {
            if (i % 2 == 0) arr[i] = (arr[i - 1] * 2 + 1)%10007;
            else arr[i] = (arr[i - 1] * 2 - 1)%10007;
        }

//        int ans = dp(n);
        System.out.println(arr[n]);

    }

    public static Integer dp(int n) {
        if (arr[n] == 0) {
            if (n % 2 == 0) arr[n] = (dp(n - 1) * 2 + 1)%10007;
            else arr[n] = (dp(n - 1) * 2 - 1)%10007;
        }
        return arr[n];
    }

}
