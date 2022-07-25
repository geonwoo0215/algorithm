package greedy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 강의실_배정 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [][] arr =new int[n][2];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0;i<n;i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] > b[0]) return 1;
            else if (a[0] == b[0]) return a[1] - b[1];
            else return -1;
        });

        priorityQueue.add(arr[0][1]);
        for(int i = 1; i<n;i++){
            if(priorityQueue.peek()<=arr[i][0]){
                priorityQueue.poll();
            }
            priorityQueue.add(arr[i][1]);
        }
        System.out.println(priorityQueue.size());

    }
}
