package baekjoon;

import java.util.Scanner;
import java.util.Arrays;

public class Main_15656 {
	
	static int N;
	static int M;
	static int[] arr;
	static int[] ans;
	static StringBuilder sb =new StringBuilder();

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
		
		dfs(0);
		System.out.print(sb);
		
		sc.close();

	}

	static void dfs(int depth) {
		
		if(depth == M) {
			for(int i=0;i<ans.length;i++) {
				sb.append(ans[i]+" ");
			}
			sb.append('\n');
			return;
		}
		
		for(int i=0;i<N;i++) {
			ans[depth]=arr[i];
			dfs(depth+1);
		}
		
	}
}
