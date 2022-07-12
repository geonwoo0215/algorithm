import java.util.*;


public class Main_9461 {	
	
	static long[] arr = new long[101];
	
	
	
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		arr[0]=0;
		arr[1]=1;
		arr[2]=1;
		arr[3]=1;
		arr[4]=2;
		arr[5]=2;
		for(int i=0;i<T;i++) {
			int num = sc.nextInt();
			System.out.println(fibo(num));
		}
	}
	
	static long fibo(int n) {
		
		if(arr[n]==0&&n!=0) {
			arr[n]=fibo(n-1)+fibo(n-5);
		}
		return arr[n];
	}
}