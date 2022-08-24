package graph;

public class target_number {

    private static int answer = 0;
    public static int solution(int[] numbers, int target) {

        dfs(1,numbers.length,numbers[0],target,1,numbers);
        dfs(1,numbers.length,-numbers[0],target,1,numbers);

        return answer;
    }

    public static void dfs(int depth, int end, int sum,int target, int idx,int[] numbers) {

        if (depth == end) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        dfs(depth+1, end, sum + numbers[idx], target, idx+1, numbers);
        dfs(depth+1, end, sum - numbers[idx], target, idx+1, numbers);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        System.out.println(solution(numbers, 3));
        answer = 0;
        int[] number = {4, 1, 2, 1};
        System.out.println(solution(number, 2));
    }
}
