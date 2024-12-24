package sorting;

import java.util.Arrays;


public class BubbleAndSelectionSort {

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 7, 9, 1, 2};
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 13, 15, 16, 20, 25};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        selectionWithMin(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void selectionWithMax(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;  // Get Last element index from array
            int maxIndex = getMax(arr, 0, lastIndex); // get Maximum value index from the array
            swap(arr, maxIndex, lastIndex);  // swap max index to last index.
        }
    }

    static void selectionWithMin(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int firstIndex = i;  // Get first element index from array
            int minIndex = getMin(arr, firstIndex, arr.length-1); // get Min value index from the array
            swap(arr, firstIndex, minIndex);  // swap min index to last index.
        }
    }

    static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static int getMin(int[] arr, int start, int end) {
        int min = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }

    //  O(N^2) complexity if array is sorted in Descending order - Worst Case
    // O(N) complexity if array is sorted in ascending - Best case
    private static void bubbleSort(int[] arr) {
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
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
