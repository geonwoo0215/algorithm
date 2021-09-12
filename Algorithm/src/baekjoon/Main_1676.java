package baekjoon;


import java.util.Scanner;


public class Main_1676 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		
		for(int i=1;i<=N;i++) {
			int temp=i;
			if(temp%5==0) {
				while(temp%5==0) {
					count++;
					temp/=5;
				}
			}
		}
		
		System.out.print(count);
		sc.close();
	
	}
}

