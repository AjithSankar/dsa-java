package recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(binarySearch(nums, 19, 0, nums.length - 1));
    }

    private static int binarySearch(int[] nums, int target, int start, int end) {
        // base condition
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, end);
        } else {
            return binarySearch(nums, target, start, mid - 1);
        }

    }
}
