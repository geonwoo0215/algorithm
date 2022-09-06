package string;

public class compression {

    public int solution(String s) {

        int str = s.length();

        for (int i = 1; i <= s.length()/2; i++) {
            int cnt = 1;
            String sub = s.substring(0, i);
            StringBuilder ans = new StringBuilder();
            for (int j = i; j <= s.length(); j += i) {
                String next = s.substring(j, Math.min(s.length(), j + i));

                if(sub.equals(next)) cnt++;
                else {
                    if (cnt != 1) {
                        ans.append(cnt).append(sub);
                        sub = next;
                        cnt = 1;
                    } else {
                        ans.append(sub);
                        sub = next;
                    }
                }
            }

            ans.append(sub);
            str = Math.min(str, ans.length());
        }

        return str;
    }

}
