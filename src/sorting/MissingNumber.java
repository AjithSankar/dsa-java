package sorting;

import java.util.Arrays;

// https://leetcode.com/problems/missing-number/description/
public class MissingNumber {

    public static void main(String[] args) {
        // Given an array nums containing n distinct numbers in the range [0, n],
        // return the only number in the range that is missing from the array.
        int[] arr = {0, 1};
        System.out.println(findMissingNumber(arr));
        System.out.println(Arrays.toString(arr));

    }

    static int findMissingNumber(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (index != arr[index]) {
                return index;
            }
        }
        return arr.length;
    }


    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
