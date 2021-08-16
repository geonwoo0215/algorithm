package baekjoon;

import java.util.Scanner;

public class Main_2231 {

	public static void main(String[] args)throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int sum = i;
			int temp = i;
			while(temp>0) {
				sum+=temp%10;
				temp/=10;
			}
			if(sum==n) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("0");	
	}
}
