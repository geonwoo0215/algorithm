package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕_배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int five = 0;
        int three = 0;
        int ans = 0;
        while(n>0){
            if (n % 5 == 0) {
                five = n / 5;
                break;
            }
            three++;
            n -= 3;
        }
        ans = five + three;
        if(n<0) ans = -1;

        System.out.println(ans);
    }
}
