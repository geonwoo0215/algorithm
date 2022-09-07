package graph;

import java.util.LinkedList;
import java.util.Queue;

public class electric {


    private static boolean[][] map;
    private static int answer = Integer.MAX_VALUE;
    private static int size;
    public int solution(int n, int[][] wires) {

        int total = wires.length - 1;
        map = new boolean[n + 1][n + 1];
        size = n;
        for (int[] wire : wires) {
            map[wire[0]][wire[1]] = map[wire[1]][wire[0]] = true;
        }

        for (int[] wire : wires) {
            map[wire[0]][wire[1]] = map[wire[1]][wire[0]] = false;
            answer = Math.min(answer, bfs(1, total));
            map[wire[0]][wire[1]] = map[wire[1]][wire[0]] = true;
        }

        return answer;
    }

    public static int bfs(int n,int total) {

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[size + 1];

        int cnt = 0;
        visited[n] = true;
        queue.offer(n);

        while (!queue.isEmpty()) {

            int temp = queue.poll();

            for (int i = 1; i <= size; i++) {

                if (map[temp][i] && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                    cnt++;
                }

            }

        }
        int rest = total - cnt;
        return Math.abs(rest - cnt);
    }

}

