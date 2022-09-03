package graph;

import java.util.LinkedList;
import java.util.List;

public class find_primeNumber {

    private static int[] arr;
    private static final List<Integer> prime = new LinkedList<>();
    private static boolean[] visited;

    public int solution(String numbers) {

        arr = new int[numbers.length()];
        visited = new boolean[arr.length];
        for (int i = 0; i < numbers.length(); i++) {
            arr[i] = numbers.charAt(i) - '0';
        }
        dfs(0);
        return prime.size();
    }

    public void dfs( int n) {

        if (isPrime(n) && !prime.contains(n)) {
            prime.add(n);
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(n * 10 + arr[i]);
                visited[i] = false;
            }
        }

    }

    public boolean isPrime(int n) {
        if(n <= 1 ) return false;
        else if (n == 2 ) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }

}
