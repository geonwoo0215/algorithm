package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_11725 {


    private static ArrayList<Integer>[] list;
    private static final Queue<Integer> queue = new LinkedList<>();
    private static boolean[] visited;
    private static int[] ans;
    private static int n;
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        list = new ArrayList[n + 1];
        ans = new int[n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }


        for (int i = 0; i < n-1; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            list[x].add(y);
            list[y].add(x);
        }

        bfs(1);
        for (int i = 2; i <=n; i++) {
            sb.append(ans[i]).append("\n");
        }
        System.out.println(sb);


    }

    public static void bfs(int v) {

        queue.offer(v);
        visited[v] = true;

        while (!queue.isEmpty()) {

            int temp = queue.poll();

            for (Integer i : list[temp]) {
                if (!visited[i]) {
                    visited[i] = true;
                    ans[i] = temp;
                    queue.offer(i);
                }
            }

        }


    }

}
