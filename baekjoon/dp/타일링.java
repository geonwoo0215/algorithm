package dp;

import java.util.Scanner;

public class 타일링 {

    private static final Integer SIZE = 1001;
    private static final Integer[] arr = new Integer[SIZE];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2])%10007;
        }


        int ans = dp(n);
        System.out.println(arr[n]);
    }

    public static Integer dp(int n) {
        if (arr[n] == null) arr[n] = dp(n - 1) + dp(n - 2);
        return arr[n] % 10007;
    }
}



