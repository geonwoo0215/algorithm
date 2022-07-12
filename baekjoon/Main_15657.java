import java.util.Arrays;
import java.util.Scanner;



public class Main_15657 {

	static int N;
	static int M;
	static int[]arr;
	static int[]ans;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[N];
		ans = new int[M];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		dfs(0,0);
	}
	
	static void dfs(int start,int depth) {
		
		if(depth == M) {
			for(int i=0;i<ans.length;i++) {
				System.out.print(ans[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=start;i<N;i++) {
			ans[depth]=arr[i];
			dfs(i,depth+1);
		}
		
		
	}

}
