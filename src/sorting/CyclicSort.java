package sorting;

import java.util.Arrays;


// Cyclic sort is work only (when the given numbers from range 1 to N)
public class CyclicSort {

    public static void main(String[] args) {

        int[] arr = {3, 4, 1, 5, 2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclicSort(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

    }


    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
