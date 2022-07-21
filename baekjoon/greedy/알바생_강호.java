package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 알바생_강호 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        long sum = 0;
        Integer[] arr = new Integer[num];

        for(int i = 0;i<num;i++){
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr, Comparator.reverseOrder());

        for(int i=0;i< arr.length;i++){
            if(arr[i] - i>0){
                sum += arr[i] - i;
            };
        }
        System.out.println(sum);
    }
}
