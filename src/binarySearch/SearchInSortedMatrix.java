package binarySearch;

import java.util.Arrays;

public class SearchInSortedMatrix {

    public static void main(String[] args) {

        // Row and Column wise sorted matrix
        int[][] matrix = {
                {5, 10, 20, 40},
                {6, 12, 22, 42},
                {8, 14, 25, 45},
                {9, 16, 28, 50}
        };

        System.out.println(Arrays.toString(search(matrix, 500)));

    }

    static int[] search(int[][] matrix, int target) {

        int row = 0;
        int col = matrix.length-1;

        while(row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                return new int[]{row,col};
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1,-1};

    }
}
