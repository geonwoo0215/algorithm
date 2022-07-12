import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main_10808 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		
		
		int[] Alphabet = new int[26];
		
		for(int i=0;i<str.length();i++) {
			
			Alphabet[str.charAt(i)-'a']++;
		}
		
		for(int i=0;i<Alphabet.length;i++) {
			System.out.printf("%d ",Alphabet[i]);
			
		}
	}
}

