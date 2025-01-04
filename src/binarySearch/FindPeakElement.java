package binarySearch;

// https://leetcode.com/problems/find-peak-element/description/
public class FindPeakElement {

    public static void main(String[] args) {
        //int[] nums = {1, 4, 5, 7, 10, 15, 12, 11};
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // we are in ascending order
                start = mid + 1;
            } else {
                // we are in descending order
                end = mid;
            }
        }
        return start;
    }


}

