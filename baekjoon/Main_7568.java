import java.util.Scanner;

public class Main_7568 {

	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int [][]arr=  new int[n][2];
		int []r = new int[n];



		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int count=0;
		for(int j=0;j<n;j++) {
		
			int rate=1;
			for(int i=0;i<n;i++) {
				if(arr[count][0]<arr[i][0]) {
					if(arr[count][1]<arr[i][1]) rate++;
				}
			}
			r[j]=rate;
			count++;
		}
		for(int i=0;i<n;i++) {
			System.out.print(r[i]+" ");
		}
		sc.close();
	}
}