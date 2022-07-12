import java.util.Arrays;
import java.util.Scanner;

public class Main_15655 {

	static int N;
	static int M;
	static int arr[];
	static int ans[];
	static boolean visited[];
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		

		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[N];
		ans = new int[M];
		visited = new boolean[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		dfs(0,0);
		sc.close();
			
	}
	
	static void dfs(int start,int depth) {
		
		if(depth ==M) {
			for(int i=0;i<ans.length;i++) {
				System.out.print(ans[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=start;i<N;i++) {
			if(visited[i]==false) {
				visited[i]=true;
				ans[depth]=arr[i];
				dfs(i,depth+1);
				visited[i]=false;
			}
		}	
	}
}