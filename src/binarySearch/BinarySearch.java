package binarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-20, -10, 0, 2, 4, 6, 15, 26, 67, 98 };
        System.out.println(binarySearch(arr, -10));
    }

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            // find mid value
            int mid = start + (end - start) / 2 ;

            if (target > arr[mid]) { // if target > mid then search in right side
                start = mid + 1;
            } else if (target < arr[mid]) {  // if target < mid then search in left side
                end = mid - 1;
            } else {
                return mid; // found target
            }
        }

        return -1;
    }
}
