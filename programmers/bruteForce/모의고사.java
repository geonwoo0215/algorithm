package bruteForce;

import java.util.ArrayList;
import java.util.List;

public class 모의고사 {

    public int[] solution(int[] answers) {

        int[] one = {1,2,3,4,5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int pointOne = 0;
        int pointTwo = 0;
        int pointThree = 0;

        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<answers.length;i++){
            if(one[i%one.length]==answers[i]){
                pointOne++;
            }
            if(two[i% two.length]==answers[i]){
                pointTwo++;
            }
            if(three[i%three.length]==answers[i]){
                pointThree++;
            }
        }

        int max = Math.max(pointOne, Math.max(pointTwo, pointThree));

        if(max == pointOne) ans.add(1);
        if(max == pointTwo) ans.add(2);
        if(max == pointThree) ans.add(3);

        return ans.stream().mapToInt(Integer::intValue).toArray();

    }
}
