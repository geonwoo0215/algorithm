package baekjoon;

import java.util.Scanner;


public class Main_1550 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int sum = 0;
		int sixt=1;
		for(int i=s.length();i>0;i--) {
			int num = 0;
			if(s.charAt(i-1)=='A') {
				num = 10;
			}
			else if(s.charAt(i-1)=='B') {
				num = 11;
			}
			else if(s.charAt(i-1)=='C') {
				num = 12;
			}
			else if(s.charAt(i-1)=='D') {
				num = 13;
			}
			else if(s.charAt(i-1)=='E') {
				num = 14;
			}
			else if(s.charAt(i-1)=='F') {
				num = 15;
			}
			else {
				num = s.charAt(i-1)-48;
			}
			sum+=num*sixt;
			sixt*=16;
		}
		System.out.println(sum);
	}
}
