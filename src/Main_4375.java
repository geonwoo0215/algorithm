import java.util.Scanner;

public class Main_4375 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int j;
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int num = 0;
			for(j=1;;j++) {
				num = (num*10+1)%n;
				
				if(num == 0) break;
			}
			

			System.out.println(j);
		}
		sc.close();

	}

}
