package arrays;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        swap(arr, 1, 4);
        System.out.println(Arrays.toString(arr));
        rotateArray(arr1);

        int[] arr2 = {11, 2, 3, 4, 5, 6, 7, 18,19};
        rotateArray(arr2);
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    private static void rotateArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
