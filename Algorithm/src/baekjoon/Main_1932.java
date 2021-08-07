package baekjoon;
import java.util.Scanner;

public class Main_1932 {	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] tri = new int [size][size];
		
		tri[0][0] = sc.nextInt();
		int max=0;
		for(int i=1;i<size;i++) {
			for(int j=0;j<=i;j++) {
				tri[i][j] = sc.nextInt();
				if(j==0) {
					tri[i][j]+=tri[i-1][j];
					
				}
				else if(j==i) {
					tri[i][j]+=tri[i-1][j-1];
			
				}
				else {
					tri[i][j]+=tri[i-1][j-1]>tri[i-1][j]?tri[i-1][j-1]:tri[i-1][j];
				}
				max=tri[i][j]>max?tri[i][j]:max;
				
			}
		}
		
		
		System.out.println(max);
		sc.close();

	}
}
