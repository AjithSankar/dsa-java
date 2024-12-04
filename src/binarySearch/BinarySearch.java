package binarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arrAsc = {-20, -10, 0, 2, 4, 6, 15, 26, 67, 98 };
        System.out.println(binarySearchAsc(arrAsc, -10));

        int[] arrDesc = {100, 78, 56, 41, 20, 15, 10, 9, 6, 3, 1, -10};
        System.out.println(binarySearchDesc(arrDesc, -10));

        // If array is sorted but doesn't know in which order then
        // we need to compare the first & last element in the array to determine the sorting order/direction
        System.out.println(orderAgnosticBinarySearch(arrAsc, 6));
        System.out.println(orderAgnosticBinarySearch(arrDesc, 3));

    }

    // If array is sorted in Ascending order
    static int binarySearchAsc(int[] arr, int target) {

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

    // If array is sorted in Descending order
    static int binarySearchDesc(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            // find mid value
            int mid = start + (end - start) / 2 ;

            if (target > arr[mid]) { // if target > mid then search in left side
                end = mid - 1;
            } else if (target < arr[mid]) {  // if target < mid then search in right side
                start = mid + 1;
            } else {
                return mid; // found target
            }
        }

        return -1;
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] > arr[end]) {
           return binarySearchDesc(arr, target);
        } else {
            return binarySearchAsc(arr, target);
        }
    }
}
