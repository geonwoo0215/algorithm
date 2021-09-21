package baekjoon;

import java.util.Scanner;

public class Main_2225{
	
	static int N;
	static int K;
	static Integer dp[][];
	
	public static void main(String args[])  {
		
		Scanner sc = new Scanner(System.in);
		
		N=sc.nextInt();
		K=sc.nextInt();
		
		dp = new Integer[N+1][K+1];
		
		for(int i=1;i<=N;i++) {
			dp[i][1]=1;
		}
		for(int i=1;i<=K;i++) {
			dp[1][i]=i;
		}
		System.out.print(plus(N,K));
	
	}
	
	static int plus(int n,int k) {
		if(dp[n][k]==null) {
			dp[n][k]=(plus(n-1,k)+plus(n,k-1))%1000000000;
		}
		return dp[n][k];
	}
}