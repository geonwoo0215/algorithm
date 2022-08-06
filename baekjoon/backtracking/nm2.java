package backtracking;

import java.util.Scanner;

public class nm2 {

    private static int[] arr;
    private static boolean[] visited;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        arr = new int[m];
        visited = new boolean[n];

        dfs(n, m, 0, 0);


    }

    public static void dfs(int n, int m, int depth,int start) {

        if (depth == m) {
            for (int i : arr) {
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(n, m, depth + 1,i+1);
                visited[i] = false;
            }
        }

    }
}
