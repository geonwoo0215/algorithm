package graph;

public class archery {
    private static int[] ans;
    private static int diff = Integer.MIN_VALUE;
    private static int[] apeachShot;
    private static int[] lionShot;
    private static final int[] lionLose = {-1};
    private static boolean canWin;

    public static int[] solution(int n, int[] info) {

        apeachShot = info;
        lionShot = new int[info.length];
        ans = new int[info.length];
        dfs(0, n);
        if(!canWin) return lionLose;

        return ans;

    }

    public static void dfs(int depth, int arrowCnt) {
        if (arrowCnt == 0 || depth == 10) {
            lionShot[10] = arrowCnt;
            compare();
            lionShot[10] = 0;
            return;
        }

        if (apeachShot[depth] < arrowCnt) {
            lionShot[depth] = apeachShot[depth] + 1;
            dfs(depth + 1, arrowCnt - lionShot[depth]);
            lionShot[depth] = 0;
        }

        dfs(depth + 1, arrowCnt);

    }

    public static void compare() {

        int apeachPoint = 0;
        int lionPoint = 0;

        for (int i = 0; i < 11; i++) {
            if (lionShot[i] > apeachShot[i]) {
                lionPoint += (10 - i);
            } else if (apeachShot[i] > 0) {
                apeachPoint += (10 - i);
            }

        }

        if (diff <= lionPoint - apeachPoint&&lionPoint-apeachPoint>0) {
            canWin = true;
            if (diff == lionPoint - apeachPoint&&!lowerPointCompare(ans,lionShot)) {
                return;
            }
            diff = lionPoint - apeachPoint;
            ans = lionShot.clone();
        }

    }

    public static boolean lowerPointCompare(int[] original, int[] cur) {

        for (int i = original.length-1; i >= 0 ; i--) {
            if (original[i] == cur[i]) {
                continue;
            }
            else return original[i] < cur[i];
        }
        return false;
    }

}
