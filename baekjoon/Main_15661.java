import java.util.Scanner;


public class Main_15661 {

	static int N;
	static int[][] arr;
	static boolean[] visited;
    static int min = Integer.MAX_VALUE;
	

	public static void main(String[] args)  {
	
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		arr = new int[N][N];
		visited = new boolean[N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				
				arr[i][j]=sc.nextInt();
			}
		}
		
		dfs(0);
		
		System.out.println(min);
		sc.close();
	}
	static void dfs(int start) {
		
		
		for(int i=start;i<N;i++) {
			if(!visited[i]) {
				visited[i]=true;
				dfs(i+1);
				visited[i]=false;
			}
		}

		diff();
	}
	static void diff() {
		int link = 0;
		int start = 0;
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				if(visited[i]&&visited[j]) {
					link+=arr[i][j];
					link+=arr[j][i];
				}
				else if(!visited[i]&&!visited[j]) {
					start+=arr[i][j];
					start+=arr[j][i];
				}
			}
		}
		
		int val = Math.abs(start-link);
		
		
		min=Math.min(min, val);
	}

}