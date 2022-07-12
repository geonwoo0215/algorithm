import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main_2606 {
	
	static int[][]graph;
	static boolean[]visited;
	
	static int V;
	static int E;
	final static int start=1;
	static int count;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt();
		int E = sc.nextInt();
		
		count=0;
		
		graph = new int[V+1][V+1];
		visited = new boolean[V+1];
		
		for(int i=0;i<E;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			graph[x][y]=graph[y][x]=1;
		}
		
		bfs(1);
		System.out.println(count);
		sc.close();
		
    }
	
//
//	static void dfs(int start) {
//		
//		visited[start]=true;
//		if(graph.length==start) {
//			return;
//		}
//		
//		for(int i=1;i<graph.length;i++) {
//			if(graph[start][i]==1 && visited[i]==false) {				
//				visited[i]=true;
//				dfs(i);
//				count++;
//			}
//		}
//	}
	
	static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		visited[start]=true;
		q.add(start);
		
		while(!(q.isEmpty())){
			
			int temp = q.poll();
			
			
			for(int i=1;i<graph.length;i++) {
				if(graph[temp][i]==1 && visited[i]==false) {
					visited[i]=true;
					count++;
					q.add(i);
				}
			}
			
			
		}
	}
}