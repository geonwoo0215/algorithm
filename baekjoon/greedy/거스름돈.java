package greedy;

import java.util.Scanner;

public class 거스름돈 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int five = 0;
        int two = 0;
        int ans = 0;
        while(n>0){
            if(n%5==0){
                five+=n/5;
                break;
            }
            two++;
            n -= 2;
        }
        ans = five + two;
        if(n<0){
            ans = -1;
        }
        System.out.println(ans);

    }
}

