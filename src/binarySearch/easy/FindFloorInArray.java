package binarySearch.easy;

public class FindFloorInArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 10, 13, 19, 21, 28};
        // Ceiling -> The greatest number less than or equal to target
        System.out.println(findCeiling(arr, 15));
    }

    private static int findCeiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return target;
            }

        }
        return arr[end];
    }
}
