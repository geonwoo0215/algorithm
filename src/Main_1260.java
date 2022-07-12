import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main_1260 {

	static int[][]graph;
	static boolean []visited;
	static int V;
	static int E;
	static int start;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		V=sc.nextInt();
		E=sc.nextInt();
		start=sc.nextInt();
		graph = new int[V+1][V+1];
		visited = new boolean[V+1];
		for(int i=0;i<E;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			graph[x][y]=graph[y][x]=1;
		}
		dfs(start);

		System.out.println();
		visited = new boolean[V+1];

		bfs(start);

	}

	static void dfs(int start) {
		visited[start]=true;
		System.out.print(start+" ");

		if(start==graph.length) return;
    	
    	
    	
    	for(int i=1;i<graph.length;i++) {
    		if(graph[start][i]==1&&visited[i]==false) {
    			dfs(i);
    		}
    	}
    	
    }
    static void bfs(int start) {
    	Queue<Integer> q = new LinkedList<Integer>();
    	q.add(start);
    	visited[start]=true;
    	
    	while(!(q.isEmpty())) {
    		int temp = q.poll();
    		System.out.print(temp +" ");
    		
    		for(int i=1;i<graph.length;i++) {
    			if(graph[temp][i]==1&&visited[i]==false) {
    				q.add(i);
    				visited[i]=true;
    			}
    		}
    	}
    }
}