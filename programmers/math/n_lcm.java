package math;

public class n_lcm {

    public int solution(int[] arr) {

        int n = arr[0];
        for (int i = 1; i < arr.length; i++) {
            n = lcm(n, arr[i]);
        }
        return n;
    }

    public static int gcd(int a, int b) {

        while (b % a != 0) {
            int temp = b % a;
            b = a;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }


}




