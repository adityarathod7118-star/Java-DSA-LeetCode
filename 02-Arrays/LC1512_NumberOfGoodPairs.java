/*
 * LeetCode 1512 - Number of Good Pairs
 *
 * Approach:
 * - Use two nested loops to compare every unique pair of elements.
 * - Start the second loop from (i + 1) to avoid comparing an element
 *   with itself and to prevent counting the same pair twice.
 * - Increment the counter whenever a good pair is found.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */
class Solution {
    public int numIdenticalPairs(int[] nums) {

        int count = 0; 
        for(int i = 0 ; i < nums.length ; i++)
        {
            for(int j = i+1 ; j < nums.length ; j++)
            {
                if(nums[i] == nums[j])
                {
                    count = count + 1;
                }
            }
        }
        return count;
    }
}