package bruteForce;

public class 카펫 {

    public int[] solution(int brown, int yellow) {

        int sum = brown + yellow;

        int[] ans = new int[2];

        for(int i = 1;i*i<=sum;i++){
            if(sum%i==0){
                if(sum/i*2+2*(i-2)==brown){
                    ans[0] = sum / i;
                    ans[1] = i;
                }
            }
        }
        return ans;

    }

}
