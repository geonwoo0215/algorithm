package string;

import java.util.Scanner;

public class B_11720 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = scanner.next();
        char[] ch = str.toCharArray();
        int sum = 0;
        for (int c : ch) {
            sum += c - '0';
        }

        System.out.println(sum);
    }
}
