/*
 * LeetCode 1672 - Richest Customer Wealth
 *
 * Approach:
 * - Traverse each customer's accounts using a nested loop.
 * - Calculate the total wealth of each customer.
 * - Keep track of the maximum wealth encountered.
 * - Return the maximum wealth after checking all customers.
 *
 * Time Complexity: O(m × n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int count = 0;
        int amt = 0;
        for(int i = 0 ; i < accounts.length; i++)
        {
            for(int j = 0 ; j < accounts[i].length ; j++)
            {
                count = count + accounts[i][j];
            }
            if(count > amt)
            {
                amt = count;
                count = 0;
            }
            else
            {
                count = 0;
            }
        }
        return amt;
    }
}