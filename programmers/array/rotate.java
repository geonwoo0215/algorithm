package array;

public class rotate {

    private static int[][] arr;
    public static int[] solution(int rows, int columns, int[][] queries) {
        arr = new int[rows][columns];
        int[] answer = new int[queries.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j]  = i * columns + j + 1;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            answer[i] = rotation(queries[i]);
        }

        return answer;
    }

    public static int rotation(int[] r) {
        int y1 = r[0]-1;
        int x1 = r[1]-1;
        int y2 = r[2]-1;
        int x2 = r[3]-1;

        int temp = arr[y1][x2];
        int min = temp;
        for (int i = x2; i > x1; i--) {
            arr[y1][i] = arr[y1][i - 1];
            min = Math.min(min, arr[y1][i]);
        }
        for (int i = y1; i < y2; i++) {
            arr[i][x1] = arr[i+1][x1];
            min = Math.min(min, arr[i][x1]);
        }

        for (int i = x1; i < x2; i++) {
            arr[y2][i] = arr[y2][i + 1];
            min = Math.min(min, arr[y2][i]);
        }

        for (int i = y2; i > y1; i--) {
            arr[i][x2] = arr[i - 1][x2];
            min = Math.min(min, arr[i][x2]);
        }
        arr[y1+1][x2] = temp;
        return min;


    }

    public static void main(String[] args) {

        int[][] arr = {{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}};

        int[] ans = solution(6, 6, arr);
        for (int an : ans) {
            System.out.println(an);
        }
    }



}
