package baekjoon;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;



public class Main_7562 {

	
	static int map[][];
	static boolean visited[][];
	static int n;
	static int startx;
	static int starty;
	static int endx;
	static int endy;
	static int[]dx= {1,1,-1,-1,2,2,-2,-2};
	static int[]dy= {2,-2,2,-2,1,-1,1,-1};
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		while(T-->0) {
			n=sc.nextInt();
			
			map=new int[n][n];
			visited=new boolean[n][n];
			startx = sc.nextInt();
			starty = sc.nextInt();
			endx = sc.nextInt();
			endy = sc.nextInt();
			bfs(startx,starty);
			System.out.println(map[endy][endx]);
		}
		sc.close();
	}
	static void bfs(int x, int y) {
		Queue<int []> q = new LinkedList<>();
		
		q.add(new int[] {y,x});
		
		visited[y][x]=true;
		
		while(!q.isEmpty()) {
			int curx = q.peek()[1];
			int cury = q.peek()[0];
			
			if(curx==endx&&cury==endy) {
				break;
			}
			
			q.poll();
			
			for(int i=0;i<8;i++) {
				int nx = curx+dx[i];
				int ny = cury+dy[i];
				
				if(nx>=0&&ny>=0&&nx<n&&ny<n) {
					if(visited[ny][nx]==false) {
						visited[ny][nx]=true;
						q.add(new int[] {ny,nx});
						map[ny][nx]=map[cury][curx]+1;
					}
				}
				
				
			}
			
			
			
			
		}
		
	}
}
