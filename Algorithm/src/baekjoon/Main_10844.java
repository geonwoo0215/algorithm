package baekjoon;

import java.util.Scanner;

public class Main_10844 {
	
	static long[][] dp;
	
	public static void main(String[] args)throws Exception {
		
		Scanner sc  = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		
		dp=new long[n+1][10];
		
	
		for(int i=1;i<10;i++) {
			dp[1][i]=1L;
		}
	
		long sum = 0L;
		for(int i=0;i<10;i++) {
			sum += StairNumber(n,i);
		}
		// 1000000000으로 두번 나누는 것을 생각하자
	    // 밑의 메서드의 반환에서 나머지를 안구하면 sum같이 long범위를 초과한다.
		// 결과에서 나누어 주지 않으면 sum이 1000000000을넘게된다 초과되지는 않는다.
		System.out.println(sum);
		sc.close();

	}

	static long StairNumber(int n,int i) {
		if(n==1) {
			return dp[n][i];
		}
		if(dp[n][i]==0) {


		if(i==0) {
			dp[n][i]=StairNumber(n-1,i+1);
		}
		else if(i==9) {
			dp[n][i]=StairNumber(n-1,i-1);
		}
		else 
			dp[n][i]=StairNumber(n-1,i-1)+StairNumber(n-1,i+1);
		}


		return dp[n][i]%1000000000;
	}

}