package baekjoon;
import java.util.Scanner;

public class Main_1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int max = 1;
		int min = 1000000;
		int ans=0;
		for(int i=0;i<n;i++) {
			
			int num = sc.nextInt();
			if(n==1) {
				ans= (int)Math.pow(num, 2);
				break;
			}
			if(num>max) max=num;
			if(num<min) min=num;
			ans=min*max;
		}
		
		System.out.println(ans);
		
		
		sc.close();
		

	}

}