package arrays;

import java.util.Arrays;

// https://leetcode.com/problems/build-array-from-permutation/
public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(nums)));

    }

    static int[] buildArray(int[] nums) {
        permutation(nums, 0);
        return nums;
    }

    private static void permutation(int[] nums, int i) {
        if (i < nums.length) {
            int result = nums[nums[i]];
            permutation(nums, i + 1);
            nums[i] = result;
        }
    }

}
