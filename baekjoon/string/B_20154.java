package string;

import java.util.Scanner;

public class B_20154 {

    private static final int[] arr = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int sum = 0;
        char[] c = str.toCharArray();

        for (char value : c) {
            sum += arr[(value - 'A')]%10;
        }

        if (sum % 2 == 0) {
            System.out.println("You're the winner?");
            return;
        }

        System.out.println("I'm a winner!");

    }
}
