package string;

public class min_max {

    public String solution(String s) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");


        for (String value : str) {
            int n = Integer.parseInt(value);
            min = Math.min(n, min);
            max = Math.max(n, max);
        }

        sb.append(min).append(" ").append(max);
        return sb.toString();
    }
}
