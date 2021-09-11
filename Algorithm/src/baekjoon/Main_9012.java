package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_9012{
	static int N;
	
	public static void main(String[] arg) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(bf.readLine());
		
		
		while(N-->0) {
			String s = bf.readLine();
			VPS(s);
		}			
		
	}
	static void VPS(String s) {
		Stack stack = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				stack.add('(');
			}
			else {
				if(stack.isEmpty()) {
					System.out.println("NO");
					return;
				}
				else {
					stack.pop();
				}
			}
		}
		if(stack.isEmpty()) {
			System.out.println("YES");
		}
		
		else {
			System.out.println("NO");
		}
		return;
		
	}
}