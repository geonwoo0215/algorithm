package greedy;

import java.util.Scanner;

public class 동전_0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int k = scanner.nextInt();

        int ans = 0;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = n-1; i >= 0; i--) {

            if (k >= arr[i]) {
                ans += k/arr[i];
                k %= arr[i];
            }
        }
        System.out.println(ans);
    }

}
