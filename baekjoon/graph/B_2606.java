package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_2606 {

    private static boolean[][] graph;
    private static boolean[] visited;

    private static int n;
    private static int m;
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        graph = new boolean[n+1][n+1];
        m = scanner.nextInt();
        visited = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            graph[x][y] = true;
            graph[y][x] = true;
        }

        dfs(1);
        System.out.println(count);

    }

//    public static void dfs(int start) {
//
//        visited[start] = true;
//
//        for (int i = 1; i <= n; i++) {
//            if (graph[start][i] && !visited[i]) {
//                count++;
//                dfs(i);
//            }
//        }
//
//    }

    public static void dfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int temp = q.poll();

            for (int i = 1; i <= n; i++) {
                if (graph[temp][i] && !visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                    count++;
                }
            }
        }
    }

}
