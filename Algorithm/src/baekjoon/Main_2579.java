package baekjoon;

import java.util.*;




public class Main_2579 {	
	
	static int[] stair = new int [301];
	static int[] dp = new int [301];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		
		for(int i =1;i<=T;i++) {
			stair[i]=sc.nextInt();
		}
		dp[0]=0;
		dp[1]=stair[1];
		dp[2]=stair[1]+stair[2];
		dp[3]=Math.max(stair[1], stair[2])+stair[3];
		System.out.println(maxvalue(T));
		sc.close();
	}
	
	static int maxvalue(int n) {
		if(dp[n]==0) {
			dp[n]=Math.max(maxvalue(n-3)+stair[n-1]+stair[n],maxvalue(n-2)+stair[n]);
		}
		return dp[n];
	}
}