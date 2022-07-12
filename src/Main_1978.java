import java.util.Scanner;
public class Main_1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = 0;
		
		
		
		boolean[] arr = new boolean[10001];
		
		for(int i=2;i<arr.length;i++) {
			arr[i]=true;
		}
		
		
		for(int i=2;i*i<arr.length;i++) {
			if(arr[i]==true) {
				for(int j=i;i*j<arr.length;j++) {
					arr[i*j]=false;
				}
			}
		}
		
		for(int i=0;i<num;i++) {
			int n = sc.nextInt();
			if(arr[n]==true) count++;	
		}
		
		System.out.println(count);
		sc.close();

	}

}
