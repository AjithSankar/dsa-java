package sorting;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicateNumber {

    public static void main(String[] args) {
        // Given an array nums of n integers where nums[i] is in the range [1, n],
        // return an array of all the integers in the range [1, n] that do not appear in nums.
        int[] arr = {3, 3, 3, 3, 3};
        System.out.println(findDuplicateNumber(arr));
        //System.out.println(Arrays.toString(arr));

    }

    static int findDuplicateNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return arr[index];
            }
        }

        return arr.length;
    }

    static int findDuplicateNumberSolution2(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }

        }

        return -1;
    }


    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
