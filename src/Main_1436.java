import java.util.Scanner;

public class Main_1436 {

	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int cnt=0;
		int num=665;
	
		
		while(cnt!=n) {
			int temp = ++num;
			while(temp>0) {
				if(temp%1000==666) {
					cnt++;
					break;
				}
				else {
					temp/=10;
				}
			}
		}
		sc.close();
		System.out.println(num);
	}
}