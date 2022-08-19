package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_1260 {

    private static boolean[] visit;
    private static boolean[][] map;
    private static int n;
    private static int m;
    private static int v;
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        v = scanner.nextInt();

        visit = new boolean[n + 1];
        map = new boolean[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            map[x][y] = true;
            map[y][x] = true;

        }
        dfs(v);
        sb.append("\n");
        visit = new boolean[n+1];
        bfs(v);
        System.out.println(sb);
    }

    public static void dfs(int v) {

        visit[v] = true;
        sb.append(v).append(" ");

        for (int i = 1; i <= n; i++) {
            if (!visit[i] && map[v][i]) {
                dfs(i);
            }

        }

    }

    public static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        visit[v] = true;
        sb.append(v).append(" ");
        q.offer(v);

        while (!q.isEmpty()) {
            int start = q.poll();

            for (int i = 1; i <= n; i++) {
                if (map[start][i] && !visit[i]) {
                    q.offer(i);
                    visit[i] = true;
                    sb.append(i).append(" ");
                }
            }

        }

    }

}
