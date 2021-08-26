package baekjoon;
import java.util.Scanner;


public class Main_15651 {

	
	static int[] map;
//	static boolean[] visited;
	static int N;
	static int M;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[M];
//		visited = new boolean[N];
		
		dfs(0);
		System.out.print(sb);
		sc.close();
		
	}
	
	static void dfs(int depth) {
		if(depth == M) {
			for(int i=0;i<map.length;i++) {
				sb.append(map[i]+" ");
				
			}
			sb.append('\n');
			return;
		}
		for(int i=0;i<N;i++) {	
				map[depth]=i+1;
				dfs(depth+1);
		}
	}
}
