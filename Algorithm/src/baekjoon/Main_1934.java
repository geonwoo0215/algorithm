package baekjoon;


import java.util.Scanner;


public class Main_1934 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0;i<T;i++) {
			int first =sc.nextInt();
			int two = sc.nextInt();
			
			int gcd = Aratos(first,two);
			
			int lcm = first*two/gcd;
			System.out.println(lcm);
			
		}

	}
	
	static int Aratos(int first,int two) {
		
		if(two%first==0) {
			return first;
		}
		
		else {
			return Aratos(two%first,first);
		}
		
	}

}
