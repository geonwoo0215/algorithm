package stack_queue;

import java.util.Stack;

public class 올바른_괄호 {

    boolean solution(String s) {

        Stack<Integer> stack = new Stack<>();

        boolean answer = true;

        for(int i = 0;i<s.length();i++){

            if(s.charAt(i)=='('){
                stack.push(0);
            }

            else{
                if(stack.isEmpty()){
                    answer = false;
                    break;
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty()){
            answer = false;
        }

        return answer;
    }
}
