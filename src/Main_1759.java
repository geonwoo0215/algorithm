import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Main_1759 {

	
	static int L;
	static int C;
	static int[] arr;
	static int[] ans;
	static boolean[] visited;
	
;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	    L = Integer.parseInt(st.nextToken());
	    C =  Integer.parseInt(st.nextToken());
		
	    String[] str = br.readLine().split(" ");
		arr = new int[C];
		visited = new boolean[C];
		ans = new int[L];
		
		
	
		for(int i=0;i<C;i++) {
			arr[i]=str[i].charAt(0);
		}
		
		Arrays.sort(arr);
		
		dfs(0,0,0,0);
		
	
	}
	
	static void dfs(int J,int M,int start,int depth) {
		
		
		if(depth==L) {
			if(J>1&&M>0) {
				for(int i=0;i<ans.length;i++) {
					
					System.out.print((char)ans[i]);
				}
				System.out.println();
			}
			return;
		}
		
		for(int i=start;i<C;i++) {
			if(visited[i]==false) {
				visited[i]=true;
				ans[depth]=arr[i];
				if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') dfs(J,M+1,i,depth+1);
				else dfs(J+1,M,i,depth+1);
				
				visited[i]=false;
			}
		}
	}
}