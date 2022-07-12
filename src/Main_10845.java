import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Main_10845{

	public static void main(String[] arg) {
	    
		Queue<Integer> q = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N =sc.nextInt();
		int last = 0;
		for(int i=0;i<N;i++) {
			String s =sc.next();
			switch(s) {
			case "push":
				int n = sc.nextInt();
				last = n;
				q.add(n);
				break;
				
			case "pop":
				if(q.isEmpty()) {
					sb.append(-1+"\n");
				}
				else {
					sb.append(q.poll()+"\n");
				}
				break;
				
			case "size":
				sb.append(q.size()+"\n");
				break;
				
			case "empty":
				if(q.isEmpty()) {
					sb.append(1+"\n");
				}
				else {
					sb.append(0+"\n");
				}
				break;
				
			case "front":
				if(q.isEmpty()) {
					sb.append(-1+"\n");
				}
				else {
					sb.append(q.peek()+"\n");
				}
				break;
			case "back":
				if(q.isEmpty()) {
					sb.append(-1+"\n");
				}
				else {
					sb.append(last+"\n");
				}
				break;
			}	
		}
		System.out.print(sb);
		

	}
	
	
}