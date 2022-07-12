import java.util.Scanner;
import java.math.BigInteger;

public class Main_8437{
	public static void main(String args[]) {
	
		BigInteger two = new BigInteger("2");
		
		Scanner sc = new Scanner(System.in);
		BigInteger total = new BigInteger(sc.next());
		BigInteger diff = new BigInteger(sc.next());
		
		BigInteger K = (total.subtract(diff)).divide(two).add(diff);
		BigInteger N = (total.subtract(diff)).divide(two);
		
		System.out.println(K);
		System.out.println(N);
	}
}
