import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;


public class Main_10828{

	public static void main(String[] arg) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String Test=bf.readLine();
		
		int N = Integer.parseInt(Test);
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<N;i++) {
		
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String str = st.nextToken();
			
			
			switch(str) {
			
			
			case "push":
				int n =Integer.parseInt(st.nextToken());
				stack.add(n);
				break;
					
				
			case "pop":
				if(stack.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(stack.pop());
				}
				break;
				
				
			case "top":
				if(stack.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(stack.peek());
				}
				break;
				
				
			case "size":
				System.out.println(stack.size());
				break;
				
			case "empty":
				if(stack.isEmpty()) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
				break;
			}
				
		}
		

	}
	
	
}
