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
		// 1000000000���� �ι� ������ ���� ��������
	    // ���� �޼����� ��ȯ���� �������� �ȱ��ϸ� sum���� long������ �ʰ��Ѵ�.
		// ������� ������ ���� ������ sum�� 1000000000���ѰԵȴ� �ʰ������� �ʴ´�.
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