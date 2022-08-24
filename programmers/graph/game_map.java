package graph;

import java.util.LinkedList;
import java.util.Queue;

public class game_map {

    public static int[] xDirection = {-1, 1, 0, 0};
    public static int[] yDirection = {0, 0, -1, 1};
    public static Queue<int[]> q = new LinkedList<>();
    public static boolean[][] visited;

    public static int solution(int[][] maps) {

        visited = new boolean[maps.length][maps[0].length];
        int answer = bfs(maps);
        if(answer==1) answer = -1;
        return answer;
    }

    public static int bfs(int[][] maps) {
        int[] arr = {0, 0};
        q.offer(arr);
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int[] temp = q.poll();
            int curX = temp[0];
            int curY = temp[1];

            for (int i = 0; i < 4; i++) {
                int nextX = curX + xDirection[i];
                int nextY = curY + yDirection[i];

                if (nextX < 0 || nextY < 0 || nextX >= maps.length || nextY >= maps[0].length) {
                    continue;
                }

                if (maps[nextX][nextY] != 0 && !visited[nextX][nextY]) {
                    visited[nextX][nextY] = true;
                    maps[nextX][nextY] = maps[curX][curY]+1;
                    int[] next = {nextX, nextY};
                    q.offer(next);
                }
            }
        }
        return maps[maps.length - 1][maps[0].length - 1];
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        System.out.println(solution(arr));
        int[][] arr2 = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}};
        System.out.println(solution(arr2));
    }

}