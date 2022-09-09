package string;

public class next_number {
    public int solution(int n) {

        int cnt = countOne(Integer.toString(n, 2));

        while (true) {
            int temp = countOne(Integer.toString(++n, 2));
            if(temp==cnt){
                break;
            }
        }
        return n;
    }

    private int countOne(String s) {

        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' == 1) {
                num++;
            }
        }
        return num;
    }
}
