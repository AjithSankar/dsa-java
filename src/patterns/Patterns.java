package patterns;

// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
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
        pattern5(5);
        System.out.println();
        pattern28(5);
        System.out.println();
        pattern31(4);
    }

    static void pattern31(int n) {
        int originalN = n;
        n = 2 * n - 1;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                //int atEveryIndex = Math.min(Math.min(row, col), Math.min(n-row, n-col)); // pattern starts from 0,1,2.. n
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - 1 - row, n - 1 - col)); // pattern starts from n, n-1,n-2...0
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }

    }

    static void pattern28(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalColsInRow; col++) {
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
