package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_1764 {

    public static void main(String[] args) throws IOException {

        Set<String> strings = new HashSet<>();
        List<String> ans = new LinkedList<>();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            strings.add(bf.readLine());
        }
        for (int i = 0; i < m; i++) {
            String str = bf.readLine();
            if (strings.contains(str)) {
                ans.add(str);
            }
        }

        Collections.sort(ans);

        System.out.println(ans.size());

        for (String an : ans) {
            System.out.println(an);
        }
    }
}
