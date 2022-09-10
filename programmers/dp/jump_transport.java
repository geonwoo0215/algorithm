package dp;

public class jump_transport {

    public int solution(int n) {

        int cnt = 1;

        while (n > 2) {
            if (n % 2 == 1) {
                n -= 1;
                cnt++;
            }
            n /= 2;
        }

        return cnt;
    }

}
