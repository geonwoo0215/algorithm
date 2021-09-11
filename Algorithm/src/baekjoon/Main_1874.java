package baekjoon;

import java.util.Scanner;

import java.util.Stack;

public class Main_1874{
	static boolean flag =false;
	static Stack<Integer> stack = new Stack<>();
	static int N;
	static int count=1;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Stack stack = new Stack<>();
		
		N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			int n = sc.nextInt();
			range(n);
			if(flag==true) break;
		}
		System.out.println(sb);
		sc.close();
	}
	
	static void range(int n) {
		if(stack.isEmpty()) {
			stack.push(count++);
			sb.append("+\n");
		}
		while(true) {
			if(stack.peek()<n) {
				stack.push(count++);
				sb.append("+\n");
				
			}
			else if(stack.peek()==n) {
				stack.pop();
				sb.append("-\n");
				break;
			}
			else {
				sb = new StringBuilder();
				sb.append("NO");
				flag=true;
				return;
			}
		}
	}
}