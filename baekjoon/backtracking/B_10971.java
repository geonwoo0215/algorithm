package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10971 {

    private static int[][] arr;
    private static boolean[] visited;
    private static long min = Long.MAX_VALUE;
    private static int n;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        n = Integer.parseInt(st.nextToken());

        arr = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            dfs(i,i,0,0);
        }
        System.out.println(min);
    }

    public static void dfs(int start, int cur,int depth,int sum) {

        if (depth == n && start ==cur) {
            min = Math.min(sum, min);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i] && arr[cur][i]>0) {
                visited[i] = true;
                dfs(start, i,depth+1,sum+arr[cur][i]);
                visited[i] = false;
            }
        }



    }
}
