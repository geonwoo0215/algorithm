package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_1325 {

    private static ArrayList<Integer>[] lists;
    private static boolean[] visited;
    private static int[] ans;
    private static int n;
    private static int m;
    private static int max = 0;
    private static final StringBuilder sb = new StringBuilder();
    private static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        lists = new ArrayList[n + 1];
        ans = new int[n + 1];
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            lists[x].add(y);
        }


        for (int i = 1; i <= n; i++) {
            bfs(i);
        }

        for (int i = 1; i <= n; i++) {
            max = Math.max(ans[i], max);
        }

        for (int i = 1; i <= n; i++) {
            if (ans[i] == max) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);

    }

    public static void bfs(int v) {

        Queue<Integer> q = new LinkedList<>();
        visited = new boolean[n + 1];
        q.offer(v);
        visited[v] = true;

        while (!q.isEmpty()) {

            int temp = q.poll();
            for (int i : lists[temp]) {
                if (!visited[i]) {
                    visited[i]=true;
                    q.offer(i);
                    ans[i]++;
                }
            }


        }


    }
}
