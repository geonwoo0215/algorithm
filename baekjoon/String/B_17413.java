package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String str = bf.readLine();
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append('<');
                flag =true;
            }
            else if (str.charAt(i) == '>') {
                sb.append('>');
                flag = false;
            }
            else if (flag) {
                sb.append(str.charAt(i));
            }
            else {
                if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                }
                else{
                    stack.push(str.charAt(i));
                }
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);

    }
}
