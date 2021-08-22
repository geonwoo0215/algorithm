package baekjoon;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Main_1012 {
	
	static int[][] map;
	static boolean[][] visited;
	static int row;
	static int col;
	static int cab;
	static int count;
	static int[] dx= {1,-1,0,0};
	static int[] dy= {0,0,1,-1};
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0) {
			count=0;
			row=sc.nextInt();
			col=sc.nextInt();
			cab=sc.nextInt();
			map=new int[col][row];
			visited= new boolean[col][row];
			
			for(int i=0;i<cab;i++) {
				int x= sc.nextInt();
				int y = sc.nextInt();
				map[y][x]=1;
			}
			
			for(int i=0;i<col;i++) {
				for(int j=0;j<row;j++) {
					if(map[i][j]==1&&visited[i][j]==false) {
						bfs(i,j);
						count++;
					}
				}
			}
			System.out.println(count);
			
		}
		
		sc.close();
		
	}
	
//	static void dfs(int y, int x) {
//		visited[y][x]=true;
//		
//		for(int i=0;i<4;i++) {
//			int nx = x+dx[i];
//			int ny = y+dy[i];
//			
//			if(nx>=0&&ny>=0&&nx<row&&ny<col) {
//				if(map[ny][nx]==1&& visited[ny][nx]==false) {
//					visited[ny][nx]=true;
//					dfs(ny,nx);
//				}
//			}
//			
//		}
//		
//	}
	
	static void bfs(int y,int x) {
		Queue<int[]> q = new LinkedList<>();
		
		visited[y][x]=true;
		q.add(new int[] {y,x});
		while(!(q.isEmpty())) {
			
			
			int curx=q.peek()[1];
			int cury=q.peek()[0];
			q.poll();
			
			for(int i=0;i<4;i++) {
				int nx = curx+dx[i];
				int ny = cury+dy[i];
				if(nx>=0 && ny>=0 && nx<row && ny<col) {
					if(map[ny][nx]==1&&visited[ny][nx]==false) {
						q.add(new int[] {ny,nx});
						visited[ny][nx]=true;
						
						
					}
				}
			}
		}
	}
}