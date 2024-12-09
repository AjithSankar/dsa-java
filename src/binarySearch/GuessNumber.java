package binarySearch;

// https://leetcode.com/problems/guess-number-higher-or-lower/
public class GuessNumber extends GuessGame {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(guessNumber(num));
    }
    public static int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start)/2;

            int guessNumber = guess(mid);

            if (guessNumber == 0) {
                return mid;
            } else if (guessNumber == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

// Inbuilt class
class GuessGame {

    public static int guess(int n) {
        int pick = 6;
        if(n == pick) {
            return 0;
        } else if (n > pick) {
            return -1;
        } else {
            return 1;
        }
    }
}
