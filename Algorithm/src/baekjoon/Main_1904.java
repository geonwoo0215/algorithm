package baekjoon;

import java.util.*;




public class Main_1904 {	
	static int[]arr=new int[1000001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		System.out.println(fibo(n));
		sc.close();
	}
	
	
	static int fibo (int n) {
		
		if(arr[n]==0) {
			arr[n]=(fibo(n-1)+fibo(n-2))%15746;
		}
		return arr[n];
	}
}