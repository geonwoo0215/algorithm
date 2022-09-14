public class ground {

    private int n;
    private int ans = 0;
    private int[][] map;
    int solution(int[][] land) {

        n = land.length;
        map = land;

        dfs(0,-1,0);

        return ans;
    }

    public void dfs(int depth, int prev, int sum) {
        if (depth == n) {
            ans = Math.max(sum, ans);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (i != prev) {

                dfs(depth + 1, i, sum + map[depth][i]);
            }
        }
    }
}
