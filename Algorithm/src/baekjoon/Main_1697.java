package baekjoon;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main_1697 {
	
	static int[] map;
	
	static int police;
	static int theaf;
	static int[] dx= {-1,1,2};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		police=sc.nextInt();
		theaf=sc.nextInt();
		map= new int[100001];
		
		bfs(police);
	
		System.out.println(map[theaf]-1);
		sc.close();
	}
	
	
	static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		map[start]++;
		while(map[theaf]==0) {
			int curx=q.poll();
			
			for(int i=0;i<3;i++) {
				int nx;
				if(i==2) {
					nx = curx*dx[i];
				}
				else {
					nx = curx+dx[i];
				}
				if(nx>=0&&nx<map.length) {
					if(map[nx]==0) {
						map[nx]=map[curx]+1;
						q.add(nx);
						
					}
						
				}
			}
		}
	}
}