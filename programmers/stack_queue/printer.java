package stack_queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class printer {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 1;
        for (int priority : priorities) {
            pq.add(priority);
        }
        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (pq.peek() == priorities[i]) {
                    if (i == location) {
                        return answer;
                    }
                    answer++;
                    pq.poll();
                }
            }
        }

        return answer;
    }
}
