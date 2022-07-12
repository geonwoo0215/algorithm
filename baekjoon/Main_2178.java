import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Main_2178 {
	
	static int[][]map;
	static boolean[][]visited;
	static int row;
	static int col;
	static int[]dx = {1,-1,0,0};
	static int[]dy = {0,0,1,-1};
	
	static int min;

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		col=sc.nextInt();
		row=sc.nextInt();
		min=row*col;
		
		map=new int[col][row];
		visited = new boolean[col][row];
		for(int i=0;i<col;i++) {
			String str =sc.next();
			for(int j=0;j<row;j++) {
				map[i][j]=str.charAt(j)-'0';
			}
		}
		
		bfs(0,0);
		sc.close();
		System.out.println(map[col-1][row-1]);
	}

	static void bfs(int y,int x) {
		Queue<int []> q =new LinkedList<>();
		q.add(new int[] {y,x});
		visited[y][x]=true;

		
		
		while(!q.isEmpty()) {
			int curx = q.peek()[1];
			int cury = q.peek()[0];
			q.poll();
			for(int i=0;i<4;i++) {
				int nx = curx+dx[i];
				int ny = cury+dy[i];
				if(nx>=0&&ny>=0&&nx<row&&ny<col) {
					if(map[ny][nx]!=0&&visited[ny][nx]==false) {
						q.add(new int[] {ny,nx});
						map[ny][nx]= map[cury][curx]+1;
						visited[ny][nx]=true;
					}
				}
			}
		}
	}
}