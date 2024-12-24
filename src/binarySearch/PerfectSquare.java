package binarySearch;

// https://leetcode.com/problems/valid-perfect-square/
public class PerfectSquare {

    public static void main(String[] args) {
        int num = 808201;
        System.out.println(isPerfectSquare(num));
    }

    // Use long instead of int
    public static boolean isPerfectSquare(int num) {

        if (num == 1) {
            return true;
        }

        long start = 0;
        long end = num / 2;

        while (start <= end) {
            long mid = start + (end - start)/2;
            if ((mid * mid) == num) {
                return true;
            } else if ((mid * mid) < num) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return false;

    }
}
