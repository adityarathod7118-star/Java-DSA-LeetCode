/*
 * LeetCode 1929 - Concatenation of Array
 
 * Approach:
 * - Create a new array of size 2 * n.
 * - Copy each element from the original array twice:
 *   1. At its original index (i).
 *   2. At index (i + n).

 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] getConcatenation(int[] nums) {
    
        int n = nums.length;
        int ans [] = new int [2*nums.length];

        for(int i =0 ; i < n ; i++)
        {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }

        return ans;

    }
}