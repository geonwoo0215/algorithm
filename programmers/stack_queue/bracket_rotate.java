package stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class bracket_rotate {

    private final Queue<Character> queue = new LinkedList<>();
    private int answer = 0;
    private int n;
    public int solution(String s) {

        n = s.length();
        for (int i = 0; i < s.length(); i++) {
            queue.offer(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            bracketCompare();
            queue.offer(queue.poll());
        }

        return answer;
    }

    public void bracketCompare() {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char temp = queue.poll();
            queue.offer(temp);
            if(stack.isEmpty()){
                stack.push(temp);
            }
            else if (temp == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                }
            }
            else if (temp == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                }
            }
            else if (temp == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                }
            }
            else {
                stack.push(temp);
            }
        }
        if (stack.size() == 0) {
            answer++;
        }
    }


}
