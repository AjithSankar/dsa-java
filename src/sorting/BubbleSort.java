package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr1 = {20, 15, 10, 6, 4, 2, 1}; // O(N^2) complexity if array is sorted in Descending order - Worst Case
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 13, 15, 16, 20, 25}; // O(N) complexity if array is sorted in ascending - Best case

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    private static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        // Special case: If given array is sorted then swap will not take place so you can end the loop
        boolean swapped = false;
        // Loop through n-1 times
        for (int i = 0; i <= n - 1; i++) {
            // For every iteration, the maximum element in the array will come at the last respective index
            for (int j = 1; j <= n - i - 1; j++) {
                // if current element is smaller than the previous element then swap
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }

                if (!swapped) {
                    break;
                }
            }
        }
        return arr;
    }
}
