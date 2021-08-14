package baekjoon;
import java.util.*;
public class Main_1149 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] pr=new int [num][3];
		
		pr[0][0]=sc.nextInt();
		pr[0][1]=sc.nextInt();
		pr[0][2]=sc.nextInt();
		
		for(int i=1;i<num;i++) {
			for(int j=0;j<3;j++) {
				pr[i][j]=sc.nextInt();
				if(j==0) {
					pr[i][j]+=pr[i-1][1]>pr[i-1][2]?pr[i-1][2]:pr[i-1][1];
				}
				else if(j==1) {
					pr[i][j]+=pr[i-1][0]>pr[i-1][2]?pr[i-1][2]:pr[i-1][0];
				}
				else {
					pr[i][j]+=pr[i-1][0]>pr[i-1][1]?pr[i-1][1]:pr[i-1][0];
				}
				
			}
		}
		
		
		System.out.println(Math.min((Math.min(pr[num-1][0],pr[num-1][1])),pr[num-1][2]));
		
		sc.close();
		
	}

}
