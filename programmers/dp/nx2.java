package dp;

public class nx2 {

    private static int[] dp;

    public int solution(int n) {
        dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2])%1000000007;
        }
        return dp[n];
//        return dp(n);
    }

//    public static int dp(int n) {
//        if (dp[n] == 0) {
//            dp[n] = dp(n - 1) + dp(n - 2);
//        }
//        return dp[n]%1000000007;
//    }

    public static void main(String[] args) {
        nx2 n = new nx2();
        System.out.println(n.solution(9));

    }
}
