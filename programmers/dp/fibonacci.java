package dp;

public class fibonacci {

    private static int[] dp;


    public int solution(int n) {

        dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
//        }

        return dp(n);
//        return dp[n];
    }

    public static int dp(int n) {
        if (dp[n] == 0 && n > 1) {
            dp[n] = (dp(n - 1) + dp(n - 2)) % 1234567;
        }
        return dp[n];
    }


}
