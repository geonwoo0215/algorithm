package String;

import java.util.Scanner;

public class B_1316 {

    private static char[] alphabet;
    private static boolean[] checker;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int cnt=0;
        checker = new boolean[n];

        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            alphabet = new char[26];
            for (int j = 0; j < str.length(); j++) {
                alphabet[str.charAt(j) - 'a']++;
                if ((alphabet[str.charAt(j) - 'a'] > 1) && (str.charAt(j) != str.charAt(j - 1))) {
                    checker[i] = true;
                }
            }
        }

        for (boolean b : checker) {
            if (!b) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
