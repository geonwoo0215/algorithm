package string;

public class binary {

    public int[] solution(String s) {

        int cnt = 0;
        int zero = 0;
        while (!s.equals("1")) {
            int one = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 1) {
                    one++;
                }
                else{
                    zero++;
                }
            }
            s = Integer.toBinaryString(one);
            cnt++;
        }

        int[] answer = {cnt,zero};
        return answer;
    }

}
