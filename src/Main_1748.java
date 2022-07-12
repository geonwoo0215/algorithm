import java.util.Scanner;
public class Main_1748 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int num = sc.nextInt();
		int change=10;
		int cnt = 1;
		int sum =0;
		
		for(int i=1;i<=num;i++) {
			if(i%change==0) {
				change*=10;
				cnt++;
			}
			sum+=cnt;
		}
		
		System.out.println(sum);
		sc.close();

	}

}
