package String;

import java.util.Arrays;
import java.util.Scanner;

public class B_1181 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }
        String[] strings = Arrays.stream(arr).distinct().sorted((a,b)-> {
            if (a.length() == b.length()) return a.compareTo(b);
            else return  a.length() - b.length();
        }).toArray(String[]::new);

        for (String string : strings) {
            System.out.println(string);
        }

    }
}
