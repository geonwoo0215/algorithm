import java.util.Scanner;

public class Main_2798 {

	public static void main(String[] args)throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int card = sc.nextInt();
		int limit = sc.nextInt();
		
		int[]arr =new int[card];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(max<arr[i]+arr[j]+arr[k]&&arr[i]+arr[j]+arr[k]<=limit) max=arr[i]+arr[j]+arr[k];
				}
			}
		}
		System.out.println(max);
		sc.close();
	}
}