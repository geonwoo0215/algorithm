package stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 주식가격 {

    public int[] solution(int[] prices) {

        int[] answer = new int[prices.length];

//        for (int i = 0; i < answer.length; i++) {
//            for (int j = i + 1; j < answer.length; j++) {
//                answer[i]++;
//                if (prices[i] > prices[j]) {
//                    break;
//                }
//
//            }
//        }

        Stack<Integer[]> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            answer[i] = answer.length - 1 - i;
            Integer[] arr = {i, prices[i]};

            while(!stack.empty() && stack.peek()[1] > prices[i]){
                Integer[] price = stack.pop();
                answer[price[0]] = i - price[0];
            }

            stack.push(arr);
        }

        return answer;
    }
}