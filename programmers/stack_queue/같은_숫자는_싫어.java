package stack_queue;

import java.util.Stack;

public class 같은_숫자는_싫어 {
    public int[] solution(int []arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {
            if(stack.isEmpty()||stack.peek()!=i){
                stack.push(i);
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();

    }
}