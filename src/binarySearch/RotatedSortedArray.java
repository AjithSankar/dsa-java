package binarySearch;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class RotatedSortedArray {
    public static void main(String[] args) {
        //int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int[] arr = {4, 5, 5, 7, 1, 1, 2};
        System.out.println(search(arr, 0));

    }

    public static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);

        // if pivot not found , it means the array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // if pivot found, then you have 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);

    }

    // Without duplicates elements
    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // case 1
            if (mid < end && arr[mid] > arr[mid + 1]) { // To avoid ArrayOutOfBoundsException
                return mid;
            }

            // case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // case 3
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else { // case 4
                start = mid + 1;
            }
        }
        return -1;
    }

    // With duplicates elements
    public static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // case 1
            if (mid < end && arr[mid] > arr[mid + 1]) { // To avoid ArrayOutOfBoundsException
                return mid;
            }

            // case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip duplicates
                // Note: what is these elements at start and end were the pivot??
                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++; // skip it

                // check if end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }

                end--; //skip it
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return start;
    }


    public static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
