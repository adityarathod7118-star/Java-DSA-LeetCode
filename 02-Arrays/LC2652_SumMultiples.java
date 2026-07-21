/*
 * LeetCode 2652 - Sum Multiples
 *
 * Approach:
 * - Traverse all numbers from 1 to n.
 * - Check if the current number is divisible by 3, 5, or 7.
 * - If it is, add it to the running sum.
 * - Return the final sum.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int sumOfMultiples(int n) {
        
        int count = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            if(i%3==0 || i%5==0 || i%7==0)
            {
                count = count + i;
            }
        }
        return count;
        
    }
}