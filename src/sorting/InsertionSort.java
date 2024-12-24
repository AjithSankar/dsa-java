package sorting;

import java.util.Arrays;


public class InsertionSort {

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 7, 9, 1, 2};
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 13, 15, 16, 20, 25};
        insertionSort(arr1);
        System.out.println(Arrays.toString(arr1));

        //System.out.println(Arrays.toString(arr1));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                // If current element at J is smaller than the j-1 then swap otherwise break
                // because left side is already sorted
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }

        }
    }


    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
