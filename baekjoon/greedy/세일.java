package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 세일 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        Integer[] arr = new Integer[n];

        for(int i = 0;i< arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr, Comparator.reverseOrder());

        for(int i = 0;i< arr.length;i++){
            if(i%3!=2) sum += arr[i];
        }
        System.out.println(sum);

    }
}

