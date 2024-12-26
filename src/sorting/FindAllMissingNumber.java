package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindAllMissingNumber {

    public static void main(String[] args) {
        // Given an array nums of n integers where nums[i] is in the range [1, n],
        // return an array of all the integers in the range [1, n] that do not appear in nums.
        int[] arr = {};
        System.out.println(findAllMissingNumber(arr));
        //System.out.println(Arrays.toString(arr));

    }

    static List<Integer> findAllMissingNumber(int[] arr) {
        int i = 0;
        List<Integer> result = new ArrayList<>();
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (index != arr[index] - 1) {
                result.add(index + 1);
            }
        }

        return result;
    }


    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
