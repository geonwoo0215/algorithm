package sort;

import java.util.Arrays;

public class h_index {

    public int solution(int[] citations) {

        Arrays.sort(citations);
        int size = citations.length;
        int ans = 0;
        for (int i = 0; i < size; i++) {
            if ( citations[i]>= size - i) {
                ans = size - i;
                break;
            }
        }
        return ans;
    }
}





