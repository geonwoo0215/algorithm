package dp;

import java.util.Scanner;

public class 피보나치_수 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int ans = fibo(n);

        System.out.println(ans);

    }

    static int fibo(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        else return fibo(n - 1) + fibo(n - 2);
    }
}
