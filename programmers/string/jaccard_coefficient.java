package string;

import java.util.LinkedList;

public class jaccard_coefficient {

    private static final LinkedList<String> list1 = new LinkedList<>();
    private static final LinkedList<String> list2 = new LinkedList<>();
    private static int unionCnt = 0;
    private static int intersectionCnt = 0;
    private static final int MAX_VALUE = Character.MAX_VALUE + 1;

    public int solution(String str1, String str2) {

        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        stringOperation(s1,list1);
        stringOperation(s2,list2);
        setOperation();

        if (unionCnt == 0 || intersectionCnt == unionCnt) {
            return MAX_VALUE;
        }

        return (int)(intersectionCnt / (double)unionCnt * MAX_VALUE);
    }

    public static void stringOperation(String s,LinkedList<String> list) {
        for (int i = 0; i < s.length()-1; i++) {
            char cur = s.charAt(i);
            char next = s.charAt(i + 1);
            if (isCharacter(cur) && isCharacter(next)) {
                list.add(s.substring(i, i + 2));
            }
        }
    }

    public static void setOperation() {
        for (String s : list1) {
            if (list2.contains(s)) {
                list2.remove(s);
                intersectionCnt++;
            }
            unionCnt++;
        }
        unionCnt += list2.size();
    }


    public static boolean isCharacter(char c) {
        return 'a' <= c && c <= 'z';
    }

}

