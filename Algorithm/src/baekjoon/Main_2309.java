package baekjoon;

import java.util.Scanner;



public class Main_2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int DWARF = 9;
		
		int arr[]=new int[DWARF];
		int sum = 0;
		for(int i=0;i<DWARF;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		boolean flag = false;

		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(sum-arr[i]-arr[j]==100) {
					arr[i]=arr[j]=0;
					flag = true;
				}
			}
			if(flag==true) break;
		}
		
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) System.out.println(arr[i]);
		}
		
		sc.close();

	}

}
