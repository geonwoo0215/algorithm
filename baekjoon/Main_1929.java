import java.util.Scanner;



public class Main_1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		boolean[] prime = new boolean[1000001];
		
		for(int i=2;i<prime.length;i++) prime[i]=true;
		
		for(int i=2;i*i<prime.length;i++) {
			if(prime[i]==true) {
				for(int j=i;j*i<prime.length;j++) {
					prime[i*j]=false;
				}
			}
		}
		for(int i=start;i<=end;i++) {
			if(prime[i]==true) System.out.println(i);
		}
		
		sc.close();
		

	}

}
