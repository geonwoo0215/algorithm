package graph;

public class fatigue {

    private int n;
    private boolean[] visited;
    private int[][] map;
    private int ans = 0;
    public int solution(int k, int[][] dungeons) {
        n = dungeons.length;
        visited = new boolean[n];
        map = dungeons;
        dfs(0, k, 0);
        return ans;
    }

    public void dfs(int depth, int stamina,int cnt) {
        if (depth == n) {
            ans = Math.max(ans, cnt);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (map[i][0] <= stamina&&!visited[i]) {
                visited[i] = true;
                dfs(depth + 1, stamina - map[i][1], cnt + 1);
                visited[i] = false;
            } else if (map[i][0] > stamina && !visited[i]) {
                visited[i] = true;
                dfs(depth + 1, stamina, cnt);
                visited[i] = false;
            }
        }


    }
}
