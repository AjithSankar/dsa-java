package arrays;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {

        int[][] arr = {
                {2, 3, 6},
                {10, 54, 78},
                {90, 4, 32}
        };

        int target = 78;
        int[] result = search(arr,target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[]{};

    }
}
