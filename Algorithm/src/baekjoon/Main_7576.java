package baekjoon;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;


public class Main_7576 {
	static int[][]map;
	static boolean[][]visited;
	
	static int row;
	static int col;
	static int[]dx= {1,-1,0,0};
	static int[]dy= {0,0,1,-1};
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		row=sc.nextInt();
		col=sc.nextInt();
		
		map=new int[col][row];
		visited = new boolean[col][row];
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				map[i][j]=sc.nextInt();
			}
		}
		bfs();
		int max = map[0][0];
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				if(map[i][j]==0) {
					System.out.println(-1);
					return;
				}
				max=max<map[i][j]?map[i][j]:max;
			}
		}
		System.out.println(max-1);
		sc.close();
	}
	
	static void bfs() {
		
		Queue<int []> q = new LinkedList<>();
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				if(map[i][j]==1) {
					q.add(new int[] {i,j});
					visited[i][j]=true;
					
				}
			}
		}
		
		while(!q.isEmpty()) {
			
			int curx = q.peek()[1];
			int cury = q.peek()[0];
			q.poll();
			for(int i=0;i<4;i++) {
				int nx = curx+dx[i];
				int ny = cury+dy[i];
				if(nx>=0&&ny>=0&&nx<row&&ny<col) {
					if(map[ny][nx]!=-1&&visited[ny][nx]==false) {
						q.add(new int[] {ny,nx});
						visited[ny][nx]=true;
						map[ny][nx]=map[cury][curx]+1;
					}
				}
				
			}
		}
	}
}