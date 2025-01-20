package arrays;

public class ArrayMax {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 18, 5, 90, 7, 8};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,0,4));
        System.out.println(min(arr));
    }

    private static int max(int[] arr) {
        int maxValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    private static int min(int[] arr) {
        int minValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }


    private static int maxRange(int[] arr, int start, int end) {
        int maxValue = arr[start];

        for (int i = start; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
