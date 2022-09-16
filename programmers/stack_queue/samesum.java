package stack_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class samesum {

    public int solution(int[] queue1, int[] queue2) {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long sum1 = 0;
        long sum2 = 0;
        for (int i = 0; i < queue1.length; i++) {
            q1.offer(queue1[i]);
            sum1 += queue1[i];
            q2.offer(queue2[i]);
            sum2 += queue2[i];
        }

        int count = 0;

        while (sum1 != sum2) {
            if (sum1 > sum2) {
                int temp = q1.poll();
                sum1 -= temp;
                sum2 += temp;
                q2.offer(temp);

            }

            else{
                int temp = q2.poll();
                sum2 -= temp;
                sum1 += temp;
                q1.offer(temp);
            }
            count++;

            if(queue1.length*3<count) return -1;

        }

        return count;
    }
}
