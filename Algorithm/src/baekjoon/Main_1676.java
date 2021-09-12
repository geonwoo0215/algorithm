package baekjoon;


import java.util.Scanner;


public class Main_1676 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int T = sc.nextInt();
		
		for(int i=0;i<T;i++) {
			int t = sc.nextInt();
			int[] arr = new int[t];
			for(int x=0;x<t;x++) {
				arr[x]=sc.nextInt();
			}
			long sum =0;
			for(int j=0;j<t;j++) {
				int temp = arr[j];
				for(int k=j+1;k<t;k++) {
					sum+=Aratos(temp,arr[k]);
				}
			}
			sb.append(sum+"\n");
		}
		System.out.print(sb);
		
		sc.close();
		
	}
	
	static int Aratos(int a,int b) {
		int max=Math.max(a, b);
		int min=Math.min(a, b);
		
		if(max%min==0) return min;
		else return Aratos(min,max%min);
	}
	
}
	



