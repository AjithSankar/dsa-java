package sorting;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindAllDuplicateNumbers {

    public static void main(String[] args) {
        // Given an integer array nums of length n where all the integers of nums are in the range [1, n] and
        // each integer appears at most twice, return an array of all the integers that appears twice.
        int[] arr = {1, 1, 2};
        System.out.println(findDuplicateNumber(arr));

    }

    static List<Integer> findDuplicateNumber(int[] arr) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            int correctIndex = arr[index] - 1;
            // If element in the array is not equal to index+1 (Array starts from 1 to N then Index=value+1) then it's misplaced
            // so we need to check if the same element is present at it's correct index.
            // If it's present then we can say that it's duplicate.
            if (arr[index] != index + 1) {
                ans.add(arr[index]);
            }
        }

        return ans;
    }


    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
