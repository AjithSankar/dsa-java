package binarySearch;

// https://leetcode.com/problems/sqrtx/description/
public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(mySqrt(25));
    }

    public static int mySqrt(int x) {

        if (x == 0) {
            return 0;
        }

        if (x == 1) {
            return 1;
        }

        int start = 0;
        int end = x / 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((long) mid * mid > (long) x) {
                end = mid - 1;
            } else if ((long) mid * mid < (long) x) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;

    }

}
