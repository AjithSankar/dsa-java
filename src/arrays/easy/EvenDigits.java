package arrays.easy;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits

public class EvenDigits {

    public static void main(String[] args) {
        int[] nums = {5557, 901, 482, 1771};
        //System.out.println(findNumbers(nums));
        System.out.println(findEvenNumbers(nums));
    }

    static int findEvenNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    private static int digits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num = num / 10;
        }
        return digits;
    }

    // Simple Approach
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            String str = Integer.toString(nums[i]);
            if (str.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
