package graph;

public class number_expression {

    private static int cnt = 0;

    public int solution(int n) {

        for (int i = 1; i <= n; i++) {
            graph(i, 0, n);
        }

        return cnt;
    }

    public void graph(int n, int sum, int target) {

        if (sum >= target) {
            if (sum == target) {
                cnt++;
            }
            return;
        }
        graph(n + 1, sum + n, target);

    }


}
