package backtracking;

import java.util.Scanner;

public class nm3 {

    private static int[] arr;

    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        arr = new int[m];


        dfs(n, m, 0);
        System.out.println(sb);

    }

    public static void dfs(int n, int m, int depth) {

        if (depth == m) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }


        for (int i = 0; i < n; i++) {
            arr[depth] = i + 1;
            dfs(n, m, depth + 1);

        }

    }
}
