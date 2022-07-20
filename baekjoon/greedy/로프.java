package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 로프 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] rope = new int[num];
        int max = 0;
        for (int i = 0; i < num;i++){
            rope[i] = scanner.nextInt();
        }

        Arrays.sort(rope);

        for(int i = 0;i<num;i++){
            max = Math.max(max, rope[i] * (num-i));
        }
        System.out.println(max);

    }

}

