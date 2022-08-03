package dp;

import java.util.Scanner;

public class 일이삼더하기 {

    private static final Integer SIZE = 11;
    private static final Integer[] arr = new Integer[SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            int ans = dp(num);
            System.out.println(ans);
        }
    }

    public static Integer dp(int n) {
        if (arr[n] == null) {
            arr[n] = dp(n - 1) + dp(n - 2) + dp(n - 3);
        }
        return arr[n];
    }
}

