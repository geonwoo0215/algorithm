package backtracking;

import java.util.Scanner;

public class B_1182 {


    private static int[] values;
    private static long ans = 0;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();

        values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        dfs(n,s,0,0);
        if (s == 0) ans--;
        System.out.println(ans);

    }

    public static void dfs(int n, int s, int depth, int sum) {

        if (depth == n) {
            if(sum == s) ans++;
            return;
        }
        dfs(n, s, depth+1, sum);
        dfs(n, s, depth + 1, sum + values[depth]);

    }

}
