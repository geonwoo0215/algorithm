import java.util.Scanner;

public class Main_14501 {

	static int[] t;
	static int[] p;
	static int[] dp;
	static int N;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		t = new int[N+1];
		p = new int[N+1];
		
		dp = new int[N+5];
		
		
		for(int i=1;i<=N;i++) {
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
			
		}
	
		System.out.print(benefit(N));


	}
	static int benefit(int n) {
		

		if(n+t[n]<=N+1) {
			dp[n]=Math.max(dp[n+1], dp[n+t[n]]+p[n]);
		}
		else {
			dp[n]=dp[n+1];

		}
		if(n==1) return dp[n];
		return benefit(n-1);
	}

}
