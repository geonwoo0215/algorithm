package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class B_2667 {

    private static int[][] map;
    private static boolean[][] visited;
    private static final int[] xDirection = {1, -1, 0, 0};
    private static final int[] yDirection = {0, 0, 1, -1};
    private static final Queue<int[]> q = new LinkedList<>();
    private static int cnt = 0;
    private static final int[] apart = new int[25*25];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        map = new int[n + 2][n + 2];
        visited = new boolean[n + 2][n + 2];
        for (int i = 1; i <= n; i++) {
            String s = bf.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j + 1] = s.charAt(j) - '0';
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (map[i][j] != 0&& !visited[i][j]) {
                    cnt++;
                    bfs(i,j);

                }
            }
        }
        System.out.println(cnt);

        Arrays.sort(apart);

        for (int i : apart) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }

    public static void bfs(int x, int y) {

        int[] arr = {x, y};
        visited[x][y] = true;
        q.offer(arr);
        apart[cnt]++;
        while (!q.isEmpty()) {
            int[] temp = q.poll();
            int currentX = temp[0];
            int currentY = temp[1];

            for (int i = 0; i < 4; i++) {
                int nextX = currentX + xDirection[i];
                int nextY = currentY + yDirection[i];
                if (map[nextX][nextY] != 0 && !visited[nextX][nextY]) {
                    visited[nextX][nextY] = true;
                    map[nextX][nextY] = cnt;
                    int[] move = {nextX, nextY};
                    q.offer(move);
                    apart[cnt]++;
                }
            }

        }

    }


}