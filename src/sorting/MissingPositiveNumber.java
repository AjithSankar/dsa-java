package sorting;

// https://leetcode.com/problems/first-missing-positive/description/
public class MissingPositiveNumber {

    public static void main(String[] args) {
        // Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
        //You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
        int[] arr = {1};
        System.out.println(firstMissingPositive(arr));

    }

    static int firstMissingPositive(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i]-1;
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index+1;
            }
        }
        return arr.length + 1;
    }


    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
