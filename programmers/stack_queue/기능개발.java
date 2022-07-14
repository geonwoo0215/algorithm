package stack_queue;

import java.util.*;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        int len = progresses.length;

        for (int i = 0; i < len; i++) {
            double doubleRest = (100 - progresses[i]) / (double) speeds[i];
            int intRest = (int) Math.ceil(doubleRest);

            if (!queue.isEmpty() && queue.peek() < intRest) {
                arrayList.add(queue.size());
                queue.clear();
            }
            queue.add(intRest);
        }
        arrayList.add(queue.size());

        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}


