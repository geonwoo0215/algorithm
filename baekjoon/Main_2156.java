import java.util.Scanner;

public class Main_2156 {
	
	static Integer[] dp;
	static Integer[] wine;
	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp=new Integer[n+1];
		wine=new Integer[n+1];
		for(int i=1;i<=n;i++) {
			wine[i]=sc.nextInt();
		}
		
		dp[0]=0;
		dp[1]=wine[1];
		if(n>1) {
			dp[2]=wine[1]+wine[2];
		}
		

		
		System.out.println(drink(n));
		sc.close();
		
		
	}
	
	public static int drink(int n) {
		if(dp[n]==null) {
			dp[n]=Math.max(Math.max(drink(n-2),drink(n-3)+wine[n-1])+wine[n],drink(n-1));
		}
		return dp[n];
	}
	
	
}