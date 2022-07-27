package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] time = new int[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            time[i] = scanner.nextInt();
            sum += time[i];
        }
        long ans = sum;
        Arrays.sort(time);

        for(int i = n-2;i>=0;i--){
            sum -= time[i + 1];
            ans += sum;
        }
        System.out.println(ans);

    }
}
