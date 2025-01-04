package binarySearch;

public class FindCeilingInArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 10, 13, 19, 21, 28};
        // Ceiling -> The smallest number greater than or equal to target
        System.out.println(findCeiling(arr, 8));
    }

    // return an index of smallest number greater than or equal to target
    private static int findCeiling(int[] arr, int target) {

        //  Edge Case, What if the target number is greater than the greatest element in array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

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
        return start;
    }
}
