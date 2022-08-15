package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_20291 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new TreeMap<>();
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), ".");
            st.nextToken();
            String ext = st.nextToken();
            if (map.containsKey(ext)) map.replace(ext, map.get(ext)+1);
            else map.put(ext, 1);
        }

        for (String s : map.keySet()) {
            sb.append(s).append(" ").append(map.get(s)).append("\n");
        }
        System.out.println(sb);

    }

}
