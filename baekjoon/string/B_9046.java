package string;

import java.util.Scanner;

public class B_9046 {

    private static final int ROW = 5;
    private static final int COLUMN = 15;
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] c = new char[ROW][COLUMN];


        for (int i = 0; i < ROW; i++) {

            String str = scanner.next();

            for (int j = 0; j < str.length(); j++) {

                c[i][j] = str.charAt(j);

            }
        }

        for (int i = 0; i < COLUMN; i++) {

            for (int j = 0; j < ROW; j++) {
                if (c[j][i] == '\0') {
                    continue;
                }
                sb.append(c[j][i]);
            }
        }

        System.out.println(sb);

    }

}
