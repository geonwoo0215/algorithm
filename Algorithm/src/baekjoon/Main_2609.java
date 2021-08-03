package baekjoon;
import java.util.Scanner;
public class Main_2609 {

	static int getgcd(int A, int B) {
		if(A%B==0) return B;
		return getgcd(B,A%B);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int gcd=0;
		int lcm=0;
		
		gcd=getgcd(Math.max(A, B),Math.min(A, B));
		lcm = A*B/gcd;
		
		
		System.out.printf("%d\n%d",gcd,lcm);
		
		
	}

}



