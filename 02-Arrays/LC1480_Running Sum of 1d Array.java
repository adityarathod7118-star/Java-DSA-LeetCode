/*
 * Problem: LC1480 - Running Sum of 1D Array
 * Difficulty: Easy
 * Topic: Arrays
 
 * Approach:
 * - Create a new array 'runningSum'.
 * - Store the first element as it is.
 * - Traverse the array from index 1.
 * - Keep a running total using a variable and store it in the result array.
 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
    public int[] runningSum(int[] nums) {
        
        int [] runningSum = new int [nums.length];
        
        int a = nums[0];
        runningSum[0] = nums[0];
        for(int i = 1 ; i < nums.length ; i++)
        {
            runningSum[i] = (a + nums[i]);
            a = a + nums[i];
        }

        return runningSum;
    }
}