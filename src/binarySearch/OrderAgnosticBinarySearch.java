package binarySearch;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int[] arrAsc = {-20, -10, 0, 2, 4, 6, 15, 26, 67, 98 };
        System.out.println(orderAgnosticBinarySearch(arrAsc, 67));

        int[] arrDesc = {100, 78, 56, 41, 20, 15, 10, 9, 6, 3, 1, -10};
        System.out.println(orderAgnosticBinarySearch(arrDesc, 9));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            // find mid value
            int mid = start + (end - start) / 2 ;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }
}
