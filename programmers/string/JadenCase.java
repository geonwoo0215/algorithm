package string;

public class JadenCase {

    public static String solution(String s) {

        StringBuilder sb = new StringBuilder();
        String[] arr = s.toLowerCase().split("");

        boolean flag = true;
        for (String value : arr) {

            if (flag) {
                sb.append(value.toUpperCase());
            }
            else{
                sb.append(value);
            }
            flag = value.equals(" ");
        }


        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "3people unFollowed  me";
        System.out.println(solution(s));
    }

}
