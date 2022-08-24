package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B_2346 {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Deque<int []> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            int[] temp = {i+1, arr[i]};
            dq.add(temp);
        }

        while (!dq.isEmpty()) {
            int[] temp = dq.poll();
            int next = temp[1];
            sb.append(temp[0]).append(" ");

            if(dq.isEmpty()) break;

            if (next > 0) {
                for (int i = 1; i < next; i++) {
                    dq.addLast(dq.pollFirst());
                }
            }
            else{
                for (int i = 0; i < -next; i++) {
                    dq.addFirst(dq.pollLast());
                }
            }
        }
        System.out.println(sb);

    }
}
