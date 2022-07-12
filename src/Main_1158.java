import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main_1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> q = new LinkedList<>();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		int idx = 0;
		int[]arr= new int[N];
		
		for(int i=1;i<=N;i++) {
			q.add(i);
		}
		
		while(!q.isEmpty()) {
			cnt++;
			if(cnt==K) {
				arr[idx++]=q.poll();
				cnt=0;
			}
			else {
				q.add(q.poll());
			}
				
		}
		System.out.print("<");
		for(int i=0;i<N-1;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print(arr[N-1]);
		System.out.print(">");
		

	}

}
