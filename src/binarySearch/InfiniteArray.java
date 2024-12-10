package binarySearch;

import java.util.Arrays;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {

    public static void main(String[] args) {
        int[] nums = {5, 6, 12, 14, 18, 20, 23, 25, 29, 31, 35, 38, 40};
        System.out.println(searchRange(nums, 20));
    }

    public static int searchRange(int[] nums, int target) {

        int start = 0;
        int end = 1;

        // You might get ArrayIndexOutOfBoundsException when you search for target element more than half of the array size
        // You can ignore this error because it's an infinite array so it has no limit.
        // https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/issues/645#issuecomment-1124640864
        while (target > nums[end]) {
            int temp = end + 1;
            // double the box value
            // end = previousEnd + sizeOfBox * 2
            end = Math.min(end + (end - start + 1) * 2, nums.length - 1);
            start = temp;
        }

        return search(nums, target, start, end);

    }


    static int search(int[] nums, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}

