package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main_2667 {

	static int [][]graph;
	static boolean [][]visited;
	static int n;
	static int[]dx = {1,-1,0,0};
	static int[]dy = {0,0,1,-1};
	static ArrayList<Integer> result=new ArrayList<Integer>();
	
	static int count;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		graph = new int[n][n];
		visited = new boolean[n][n];
		
		
		for(int i=0;i<n;i++) {
			String str=sc.next();
			for(int j=0;j<n;j++) {
				graph[i][j]=str.charAt(j)-'0';
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				count=0;
				if(graph[i][j]==1&&visited[i][j]==false) {
					bfs(i,j);
					
					count++;
					result.add(count);
				}
			}
		}
		
		System.out.println(result.size());
		Collections.sort(result);
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i));
		}
	
	}

//	static void dfs(int x,int y) {
//
//
//		visited[x][y]=true;
//
//		for(int i=0;i<4;i++) {
//			int nx = x+dx[i];
//			int ny = y+dy[i];
//			if(nx>=0&&ny>=0&&nx<n&&ny<n) {
//				if(graph[nx][ny]==1&&visited[nx][ny]==false)
//				{
//					dfs(nx,ny);
//					count++;
//				}
//			}
//		}
//	}
	static void bfs(int x,int y) {
		Queue<int []> q= new LinkedList<>();
	
		visited[x][y]=true;
	
		q.add(new int[] {x,y});
		while(!(q.isEmpty())) {
			
		
			int curx=q.peek()[0];
			int cury=q.peek()[1];
			q.poll();
			for(int i=0;i<4;i++) {
				int nx = curx + dx[i];
				int ny = cury + dy[i];
				
				if(nx>=0&&ny>=0&&nx<n&&ny<n) {
					if(graph[nx][ny]==1&&visited[nx][ny]==false) {
						q.add(new int[] {nx,ny});
						count++;
						visited[nx][ny]=true;
					}
				}
			}

		}
	}
}
