package hash;

import java.util.HashMap;

public class Camouflage {

    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            hashMap.put(clothes[i][1], hashMap.getOrDefault(clothes[i][1], 0) + 1);
        }
        for (String s : hashMap.keySet()) {
            answer *= (hashMap.get(s) + 1);
        }

        answer -= 1;
        return answer;
    }

}
