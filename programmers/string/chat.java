package string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class chat {

    public String[] solution(String[] record) {

        Map<String, String> map = new HashMap<>();
        LinkedList<String[]> order = new LinkedList<>();
        LinkedList<String> ans = new LinkedList<>();

        for (String value : record) {
            String[] str = value.split(" ");
            if (str[0].equals("Enter")) {
                String[] arr = {str[1], str[0]};
                order.add(arr);
                map.put(str[1], str[2]);
            } else if (str[0].equals("Leave")) {
                String[] arr = {str[1], str[0]};
                order.add(arr);
            } else if (str[0].equals("Change")) {
                map.replace(str[1], str[2]);
            }
        }

        for (String[] strings : order) {
            StringBuilder sb = new StringBuilder();
            if (strings[1].equals("Enter")) {
                String s = map.get(strings[0]) + "님이 들어왔습니다.";
                sb.append(s);
            }
            else{
                String s = map.get(strings[0]) + "님이 나갔습니다.";
                sb.append(s);
            }
            ans.add(sb.toString());
        }

        return ans.toArray(new String[ans.size()]);


    }

}
