package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_2178 {

    private static int[][] map;
    private static StringTokenizer st;
    private static boolean[][] visited;
    private static int n;
    private static int m;
    private static final int[] xDirection = {-1, 1, 0, 0};
    private static final int[] yDirection = {0, 0, -1, 1};
    private static final Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n+2][m+2];
        visited = new boolean[n+2][m+2];

        for (int i = 1; i <= n; i++) {
            String s = bf.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j+1] = s.charAt(j)-'0';
            }
        }

        bfs(1, 1);
        System.out.println(map[n][m]);

    }

    public static void bfs(int x, int y) {

        visited[x][y] = true;
        int[] arr = {x, y};
        q.offer(arr);

        while (!q.isEmpty()) {

            int[] temp = q.poll();
            int currentX = temp[0];
            int currentY = temp[1];
            for (int i = 0; i < 4; i++) {
                int moveX = currentX + xDirection[i];
                int moveY = currentY + yDirection[i];
                if (map[moveX][moveY]!=0&&!visited[moveX][moveY]) {
                    visited[moveX][moveY]=true;
                    int[] moved = {moveX, moveY};
                    q.offer(moved);
                    map[moveX][moveY] = map[currentX][currentY] + 1;
                }
            }

        }


    }
}
