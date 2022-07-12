import java.util.Stack;
import java.util.Scanner;

public class Main_10799{

	public static void main(String[] arg) {
	    
		
		Stack<Character> st = new Stack<>();
		
		char last=' ';
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		String batch = sc.next();

		for(int i=0;i<batch.length();i++) {
			if(batch.charAt(i)=='(') {
				st.add(batch.charAt(i));
				last = '(';
			}
			else {
				st.pop();
				if(last=='(') {
					count+=st.size();
				}
				else {
					count+=1;
				}
				last=')';
			}
		}
		System.out.println(count);
		sc.close();		
	}
	
}