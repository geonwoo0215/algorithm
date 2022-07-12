import java.util.Scanner;



public class Main_15649 {

	static int N;
	static int M;
	
	static boolean[] visited;
	static int[] map;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[M];
		visited= new boolean[N];
		dfs(0);
		sc.close();
		
	}
	
	static void dfs(int depth) {
		
		if(depth==M) {
			for(int i=0;i<map.length;i++) {
				System.out.print(map[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(visited[i]==false) {
				visited[i]=true;
				map[depth]=i+1;
				dfs(depth+1);
				visited[i]=false;
			}
	
		}
	}
}
