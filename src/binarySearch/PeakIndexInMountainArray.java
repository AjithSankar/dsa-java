package binarySearch;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class PeakIndexInMountainArray {

    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 7, 10, 15, 12, 11};
        System.out.println(peakIndexInMountainArray(nums));
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


}

