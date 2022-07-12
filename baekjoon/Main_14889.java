import java.util.Scanner;

public class Main_14889 {

	static int N;
	static int[][] arr;
	static boolean[] visited;
	static int[] ans;
	static int MIN=100000000;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		N =sc.nextInt();
		
		arr = new int[N][N];
		ans = new int[N/2];
		visited = new boolean[N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		dfs(0,0);
		System.out.print(MIN);
		sc.close();
	
	}
	static void dfs(int start,int depth) {
		
		if(depth==N/2) {
			howdiff();
		}
		
		
		for(int i=start;i<N;i++) {
			if(!visited[i]) {
				visited[i]=true;
				dfs(i+1,depth+1);
				visited[i]=false;
			}
		}
	}
	
	static void howdiff() {
		int[] start = new int[N/2];
		int[] link = new int[N/2];
		int scnt =0;
		int lcnt =0;
		int ssum =0;
		int lsum = 0;
		for(int i=0;i<N;i++) {
			if(visited[i]) {
				start[scnt++]=i;
			}
			else {
				link[lcnt++]=i;
			}
		}
		
		for(int i=0;i<N/2;i++) {
			for(int j=0;j<N/2;j++) {
				ssum+=arr[start[i]][start[j]];
				lsum+=arr[link[i]][link[j]];
			}
		}
		
		MIN = Math.min(MIN, Math.abs(ssum-lsum));
		
		
		
	}

}
