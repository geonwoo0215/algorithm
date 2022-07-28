package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 서강근육맨 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] arr = new long[n];

        for(int i = 0;i<n;i++){
            arr[i] = scanner.nextLong();
        }
        Arrays.sort(arr);

        long m = 0;

        if(n%2==0){

            for(int i = 0;i <n/2;i++){
                m = Math.max(m, arr[i] + arr[n - 1 - i]);
            }
        }

        if(n%2!=0){

            m = arr[n-1];

            for(int i = 0;i <(n-1)/2;i++){
                m = Math.max(m, arr[i] + arr[n - 2 - i]);
            }
        }

        System.out.println(m);
    }
}
