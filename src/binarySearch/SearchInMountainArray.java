package binarySearch;

// https://leetcode.com/problems/find-in-mountain-array/description/
public class SearchInMountainArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,3,1};
        System.out.println(findInMountainArray(nums, 3));
    }

    static int findInMountainArray(int[] nums, int target) {
        int peak = peakIndexInMountainArray(nums);

        int firstTry = orderAgnosticBinarySearch(nums, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }

        return orderAgnosticBinarySearch(nums, target, peak,nums.length-1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end -start) / 2;
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

    public static int orderAgnosticBinarySearch(int[] nums, int target, int start, int end) {

        boolean isAsc = nums[start] < nums[end];

        while (start <= end) {

            // find mid value
            int mid = start + (end - start) / 2 ;
            int midValue = nums[mid];

            if (target == midValue) {
                return mid;
            }

            if (isAsc) {
                if (target > midValue) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < midValue) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }


}

