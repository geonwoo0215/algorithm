package string;

import java.util.Scanner;

public class B_11365 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        while (!str.equals("END")) {
            System.out.println(new StringBuffer(str).reverse());
            str = scanner.nextLine();
        }
    }

}
