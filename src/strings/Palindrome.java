package strings;

public class Palindrome {

    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome1(str));
    }

    // Solution 1
    static boolean isPalindrome1(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    // solution 2
    static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
