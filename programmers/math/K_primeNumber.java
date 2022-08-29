package math;

public class K_primeNumber {

    public int solution(int n, int k) {

        String s = Long.toString(n, k);
        int answer = 0;
        int j = 0;
        for (int i = 0; i < s.length()-1; i=j) {
            j = i + 1;
            while (j<s.length()&&s.charAt(j)!= '0') {
                j++;
            }
            if (isPrime(Long.parseLong(s.substring(i, j)))) {
                answer++;
            }
        }
        return answer;
    }

    public static boolean isPrime(long n) {

        if(n<=1)return false;
        else if(n == 2 )return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }


}
