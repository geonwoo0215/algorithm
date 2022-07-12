import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_7569 {
	static int[][][]map;
	static boolean[][][]visited;
	
	static int row;
	static int col;
	static int floor;
	static int[]dx= {1,-1,0,0,0,0};
	static int[]dy= {0,0,1,-1,0,0};
	static int[]dz= {0,0,0,0,1,-1};
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		row=sc.nextInt();
		col=sc.nextInt();
		floor=sc.nextInt();
		map=new int[floor][col][row];
		visited=new boolean[floor][col][row];
		for(int i=0;i<floor;i++) {
			for(int j=0;j<col;j++) {
				for(int k=0;k<row;k++) {
					map[i][j][k]=sc.nextInt();
				}
			}
		}
		bfs();
		
		int max =-2;
		for(int i=0;i<floor;i++) {
			for(int j=0;j<col;j++) {
				for(int k=0;k<row;k++) {
					if(map[i][j][k]==0) {
						System.out.println(-1);
						return;
					}
					max=max<map[i][j][k]?map[i][j][k]:max;

				}

			}
		}
		if(max==1) {
			System.out.println(0);
			return;
		}
		else if(max==-1) {
			System.out.println(-1);
			return;
		}
		System.out.println(max-1);

		sc.close();
	}
	



	static void bfs() {

		Queue<dot> q = new LinkedList<>();
		for(int i=0;i<floor;i++) {
			for(int j=0;j<col;j++) {
				for(int k=0;k<row;k++) {
					if(map[i][j][k]==1) {
						q.add(new dot (i,j,k));
						visited[i][j][k]=true;
					
					}
				}
			}
		}

		while(!q.isEmpty()) {
			dot d=q.poll();
			int curx = d.x;
			int cury = d.y;
			int curz = d.z;
			
			for(int i=0;i<6;i++) {
				int nx = curx+dx[i];
				int ny = cury+dy[i];
				int nz = curz+dz[i];
				if(nx>=0&&ny>=0&&nz>=0&&nx<row&&ny<col&&nz<floor) {
					if(map[nz][ny][nx]==0&&visited[nz][ny][nx]==false) {
						q.add(new dot (nz,ny,nx));
						
						map[nz][ny][nx]=map[curz][cury][curx]+1;
					}
				}

			}
		}
	}
}

class dot{
	int x;
	int y;
	int z;

	dot(int z,int y,int x){
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
