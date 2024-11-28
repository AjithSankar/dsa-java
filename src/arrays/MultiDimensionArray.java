package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {

    public static void main(String[] args) {

        int[][] arr2D = new int[3][3];

//        int[][] arr2D = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

        Scanner in = new Scanner(System.in);

        for(int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = in.nextInt();
            }
        }

        for(int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print(arr2D[row][col] + " ");
            }
            System.out.println();
        }

//        for (int[] arr: arr2D) {
//            System.out.println(Arrays.toString(arr));
//            //int search = Arrays.binarySearch(arr, 1);
//        }

    }
}
