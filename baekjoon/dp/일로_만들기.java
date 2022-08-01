package dp;

import java.util.Scanner;

import static java.lang.Math.*;

public class 일로_만들기 {

    private static final Integer SIZE = 1000001;
    private static final Integer[] arr = new Integer[SIZE];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        arr[1] = 0;
        arr[2] = 1;
        arr[3] = 1;

        int ans = dp(n);

        System.out.println(ans);

    }

    public static Integer dp(int n) {
        if (arr[n] == null) {
            if(n%6==0) arr[n] = min(dp(n / 3), min(dp(n - 1), dp(n / 2)))+1;
            else if(n%3==0) arr[n] = min(dp(n / 3), dp(n - 1))+1;
            else if(n%2==0) arr[n] = min(dp(n / 2), dp(n - 1))+1;
            else arr[n] = dp(n - 1) + 1;
        }
        return arr[n];
    }
}
