package dp;

import java.util.Scanner;

public class 계단_오르기 {

    private final static Integer SIZE = 301;
    private final static Integer[] arr = new Integer[SIZE];
    private final static int[] point = new int[SIZE];


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            point[i] = scanner.nextInt();
        }
        arr[0] = 0;
        arr[1] = point[1];
        arr[2] = point[2]+point[1];
//        long ans = dp(n);

        for (int i = 3; i <= n; i++) {
            arr[i] = Math.max(arr[i - 3] + point[i - 1], arr[i - 2]) + point[i];
        }

        System.out.println(arr[n]);

    }

    public static Integer dp(int n) {
        if (arr[n] == null) {
            arr[n] = Math.max(dp(n - 3)+point[n-1], dp(n - 2))+point[n];
        }
        return arr[n];
    }
}
