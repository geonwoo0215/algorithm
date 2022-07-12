import java.util.Scanner;

public class Main_1018 {
	
	
	static boolean[][] board;
	static int min = 32;
	

	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		board=new boolean[row][col];
		
		for(int i=0;i<row;i++) {
			String str = sc.next();
			for(int j=0;j<col;j++) {
				if(str.charAt(j)=='W') board[i][j]=true;
				else board[i][j]=false;
			}
		}
		
		
		int rowstart = row-7;
		int colstart = col-7;
		
		
		for(int i=0;i<rowstart;i++) {
			for(int j=0;j<colstart;j++) {
				count(i,j);
			}
		}
		System.out.println(min);
		sc.close();
	}
	
	public static void count(int row,int col) {
		int row_end=row+8;
		int col_end=col+8;
		int count = 0;
		
		
		boolean color = board[row][col];
		
		for(int i=row;i<row_end;i++) {
			for(int j=col;j<col_end;j++) {
				
				
				
				if(board[i][j]!=color) {
					count++;
				}
				
				color=(!color);
			}
			color=(!color);
		}
		
		
		count = Math.min(count,64-count);
		
		min = Math.min(min, count);	
	}
}
