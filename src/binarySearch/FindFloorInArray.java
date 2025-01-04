package binarySearch;

public class FindFloorInArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 10, 13, 19, 21, 28};
        // Ceiling -> The greatest number less than or equal to target
        System.out.println(findFloor(arr, 9));
    }

    // return an index of greatest number less than or equal to target
    private static int findFloor(int[] arr, int target) {

        // Edge Case, What if the target number is smaller than the smallest element in array
        if (target < arr[0]) {
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
        return end;
    }
}
