package dp;

import java.util.Scanner;

public class 피보나치_수_2 {

    private static final int SIZE = 91;
    private static final Long[] arr = new Long[SIZE];

    public static void main(String[] args) {

        arr[0] = 0L;
        arr[1] = 1L;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long ans = fibo(n);

        System.out.println(ans);

    }

    public static Long fibo(int n) {
        if (arr[n] == null) {
            arr[n] = fibo(n - 1) + fibo(n - 2);
        }
        return arr[n];
    }
}
