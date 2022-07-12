import java.util.Scanner;

public class Main_11054 {

	static Integer[] dp1;
	static Integer[] dp2;
	static int[] arr1;
	static int[] arr2;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		dp1=new Integer[n];
		dp2=new Integer[n];
		arr1=new int[n];
		arr2=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[n-1-i]=arr1[i];
		}
		for(int i=0;i<n;i++) {
			Lis(i,arr1,dp1);
			Lis(i,arr2,dp2);
		}
		
		int max=dp1[0]+dp2[n-1]-1;
		
		for(int i=0;i<n;i++) {
			if(max<dp1[i]+dp2[n-1-i]-1) max=dp1[i]+dp2[n-1-i]-1;
		}
		
		System.out.println(max);
		sc.close();
		
	}
	
	static int Lis(int n,int[]arr,Integer[]dp) {
		if(dp[n]==null) {
			dp[n]=1;
			for(int i=0;i<n;i++) {
				if(arr[i]<arr[n]) {
					dp[n]=Math.max(Lis(i,arr,dp)+1, dp[n]);
				}
			}
		}
		return dp[n];
	}
	
}