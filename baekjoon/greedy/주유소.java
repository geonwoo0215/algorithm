package greedy;

import java.util.Scanner;

public class 주유소 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int city = scanner.nextInt();

        long[] length = new long[city-1];
        long[] oilPrice = new long[city];

        for(int i =0;i<city-1;i++){
            length[i] = scanner.nextLong();
        }
        for(int i = 0; i <city;i++){
            oilPrice[i] = scanner.nextLong();
        }
        long min = oilPrice[0];
        long sum = length[0] * oilPrice[0];
        for(int i = 1;i<city-1;i++){
            min = Math.min(min, oilPrice[i]);
            sum += min * length[i];
        }
        System.out.println(sum);
    }
}
