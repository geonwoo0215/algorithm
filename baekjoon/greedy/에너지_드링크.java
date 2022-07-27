package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 에너지_드링크 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double ans = 0;
        long[] arr = new long[n];
        for(int i = 0 ;i<n;i++){
            arr[i] = scanner.nextLong();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n - 1;i++) {
            ans += (double) arr[i] / 2;
        }
        ans += arr[n-1];
        System.out.println(ans);
    }
}

