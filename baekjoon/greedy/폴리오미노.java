package greedy;

import java.util.Scanner;

public class 폴리오미노 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        str = str.replace("XXXX", "AAAA").replace("XX", "BB");

        if(str.contains("X")) str = "-1";
        System.out.println(str);

    }
}
