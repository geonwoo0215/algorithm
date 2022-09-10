package simple;

public class tournament {

    public int solution(int n, int a, int b)
    {
        int cnt = 0;
        while (a!=b) {
            cnt++;
            if (a % 2 != 0) a += 1;
            if (b % 2 != 0) b += 1;
            a /= 2;
            b /= 2;
        }

        return cnt;
    }

}
