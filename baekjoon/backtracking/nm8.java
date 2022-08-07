package backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class nm8 {


    private static int[] arr;
    private static int[] values;
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        arr = new int[m];
        values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        Arrays.sort(values);
        dfs(n, m, 0, 0);

        System.out.println(sb);
    }

    public static void dfs(int n, int m, int depth, int start) {

        if (depth == m) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < n; i++) {

            arr[depth] = values[i];
            dfs(n, m, depth + 1,i);
        }
    }

}
