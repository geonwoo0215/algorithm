package baekjoon;

import java.util.Scanner;



public class Main_11053 {
	static int[] arr;
	static Integer[]dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		int n = sc.nextInt();
		
		arr = new int[n];
		dp = new Integer[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<n;i++) {
			Lis(i);
		}
		int max=dp[0];
		
		for(int i=1;i<n;i++) {
			max=Math.max(max,dp[i]);
		}

		
		System.out.println(max);
		sc.close();
	}
	
	public static int Lis(int n) {
		if(dp[n]==null) {
			dp[n]=1;
			for(int i =n-1;i>=0;i--) {
				if(arr[i]<arr[n]) {
					dp[n]=Math.max(Lis(i)+1,dp[n]);
				}
			}
		}
		return dp[n];
	}

}
