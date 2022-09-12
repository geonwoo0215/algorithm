package string;

import java.util.ArrayList;
import java.util.LinkedList;

public class press {

    LinkedList<String> list = new LinkedList<>();
    ArrayList<Integer> idx = new ArrayList<>();
    public int[] solution(String msg) {

        char start = 'A';

        for (int i = 0; i < 26; i++) {
            char temp = (char)(start + i);
            list.add(String.valueOf(temp));
        }
        LZW(msg);

        return idx.stream().mapToInt(Integer::intValue).toArray();
    }

    public void LZW(String str) {
        for (int i = 0; i < str.length(); i++) {
            String sub = str.substring(0, i + 1);
            if (!list.contains(sub)) {
                list.add(sub);
                idx.add(list.indexOf(str.substring(0, i))+1);
                LZW(str.substring(i));
                break;
            }

            else{
                if (i + 1 == str.length()) {
                    idx.add(list.indexOf(str.substring(0, i + 1))+ 1);
                }
            }
        }
    }
}
