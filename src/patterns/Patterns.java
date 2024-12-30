package patterns;

public class Patterns {

    /*
      How to approach any pattern problems?

      1. No of lines == No of rows == No of times outer for loop will run
      2. Identify for every row number,
         how many columns are there?
         Type of elements in the column?
      3. What do you need to print for every element?

     */

    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(11);
    }

    static void pattern5(int n) {
        int mid = n / 2;
        for (int row = 0; row <= mid; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = mid + 1; row < n; row++) {
            for (int col = n; col > row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col++ + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
