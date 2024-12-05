package arrays.easy;
// https://leetcode.com/problems/richest-customer-wealth/description/
public class MaxWealth {

    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,13},
                {3,2,10}
        };

        System.out.println(maxWealth(accounts));

    }

    private static int maxWealth(int[][] accounts) {

        // person = row
        // accounts(bank) = col

        int maxSum = 0;
        for (int[] person : accounts) {
            // Take new sum for the row
            int currentSum = 0;

            for (int account : person) {
                currentSum += account;
            }

            // now we have sum of accounts of person
            // compare with maxSum

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}
