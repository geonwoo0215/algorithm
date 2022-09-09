package string;

import java.util.LinkedList;

public class end_to_end {

    LinkedList<String> list = new LinkedList<>();

    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        list.add(words[0]);
        char prev = words[0].charAt(words[0].length() - 1);

        for (int i = 1; i < words.length; i++) {

            if (list.contains(words[i])||prev != words[i].charAt(0)) {
                answer[0] = (i + 1) % n != 0 ? (i + 1) % n : n;
                answer[1] = (int)Math.ceil((i + 1) / (double) n);
                return answer;
            }
            list.add(words[i]);
            prev = words[i].charAt(words[i].length() - 1);
        }

        return answer;

    }

}
