import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;


public class Main_9093 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str = bf.readLine();
		int T = Integer.parseInt(str);
		
		StringBuilder sb = new StringBuilder();
		
		while(T-->0) {
			Stack sta = new Stack();
			String  s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			while(st.hasMoreTokens()) {
				String temp = st.nextToken();
				for(int i=0;i<temp.length();i++) {
					sta.add(temp.charAt(i));
				}
				for(int i=0;i<temp.length();i++) {
					sb.append(sta.pop());
				}
				sb.append(" ");
				
			}
			sb.append("\n");
			
			
		}
		System.out.print(sb);
	

	}

}
