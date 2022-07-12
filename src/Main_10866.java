import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main_10866 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Deque<Integer> dq = new LinkedList<>();
		
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			String s = sc.next();
			
			switch(s) {
			case "push_front":
				int f =sc.nextInt();
				dq.addFirst(f);
				break;
			case "push_back":
				int b =sc.nextInt();
				dq.addLast(b);
				break;
			case "pop_front":
				if(dq.isEmpty()) {
					sb.append(-1+"\n");
				}
				else {
					sb.append(dq.pollFirst()+"\n");
				}
				break;
			case "pop_back":
				if(dq.isEmpty()) {
					sb.append(-1+"\n");
				}
				else {
					sb.append(dq.pollLast()+"\n");
				}
				break;
				
			case "size":
				sb.append(dq.size()+"\n");
				break;
				
			case "empty":
				if(dq.isEmpty()) {
					sb.append(1+"\n");
				}
				else {
					sb.append(0+"\n");
				}
				break;
			case "front":
				if(dq.isEmpty()) {
					sb.append(-1+"\n");
				}
				else {
					sb.append(dq.peekFirst()+"\n");
				}
				break;
				
			case "back":
				if(dq.isEmpty()) {
					sb.append(-1+"\n");
				}
				else {
					sb.append(dq.peekLast()+"\n");
				}
				break;
				
			}
			
		}
		
		System.out.print(sb);
		sc.close();

	}

}
