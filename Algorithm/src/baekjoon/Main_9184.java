package baekjoon;

import java.util.*;




public class Main_9184 {	static int[][][] dp =new int[21][21][21];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a==-1&&b==-1&&c==-1) return;
			else {
				System.out.printf("w(%d, %d, %d) = %d\n",a,b,c,w(a,b,c));
			}
		}


	}



	static int w (int a, int b, int c) {
		
		// 코드가 더럽다. 값이 저장되있는것을 종합하여 한번에 확인하는 함수를 만들어 반환시키도록한다.
		
		if(a<=0||b<=0||c<=0) return 1;


		else if(a>20||b>20||c>20) {
			if(dp[20][20][20]==0) dp[20][20][20] = w(20,20,20);
			return dp[20][20][20];
		}


		else if(a<b&&b<c) {
			if(dp[a][b][c-1]==0) {
				dp[a][b][c-1]=w(a,b,c-1);
			}
			if(dp[a][b-1][c-1]==0) {
				dp[a][b-1][c-1]=w(a,b-1,c-1);
			}
			if(dp[a][b-1][c]==0) {
				dp[a][b-1][c]=w(a,b-1,c);
			}
			return  dp[a][b][c-1]+dp[a][b-1][c-1]-dp[a][b-1][c];
		}


		else {
			if(dp[a-1][b][c]==0) {
				dp[a-1][b][c]=w(a-1,b,c);
			}
			if(dp[a-1][b-1][c]==0) {
				dp[a-1][b-1][c]=w(a-1,b-1,c);
			}
			if(dp[a-1][b][c-1]==0) {
				dp[a-1][b][c-1]=w(a-1,b,c-1);
			}
			if(dp[a-1][b-1][c-1]==0) {
				dp[a-1][b-1][c-1]=w(a-1,b-1,c-1);
			}

			return 	dp[a-1][b][c]+dp[a-1][b-1][c]+dp[a-1][b][c-1]-dp[a-1][b-1][c-1];


		}

	}
}



