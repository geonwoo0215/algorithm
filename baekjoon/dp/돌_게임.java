package dp;

import java.util.Scanner;

public class 돌_게임 {

    public static final Integer SIZE = 10001;
    public static final String[] arr = new String[SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        arr[1] = "SK";
        arr[2] = "CY";
        arr[3] = "SK";

        String winner = game(n);

        System.out.println(winner);

    }

    public static String game(int n){
        if(arr[n]==null){
            arr[n] = game(n - 2);
        }
        return arr[n];
    }
}

