package backtracking;

import java.util.Scanner;

public class nm1 {

    private static int[] arr;
    private static boolean[] visit;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        arr = new int[m];
        visit = new boolean[n];

        dfs(n,m,0);

    }

    public static void dfs(int n, int m, int depth) {
        if (depth == m) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(n, m, depth + 1);
                visit[i] = false;
            }
        }

    }
}
