/*
 * LeetCode 1295 - Find Numbers with Even Number of Digits
 *
 * Approach:
 * - Traverse each number in the array.
 * - Count the number of digits using repeated division by 10.
 * - If the digit count is even, increment the result.
 * - Return the total count of numbers with an even number of digits.
 *
 * Time Complexity: O(n × d)
 * Space Complexity: O(1)
 */
class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        int NumberOfDigitNums = 0;
        for(int i = 0 ; i<nums.length ; i++)
        {
            while(nums[i] > 0)
            {
                count = count + 1;
                nums[i] = nums[i] / 10;
            }

            if(count % 2 == 0)
            {
                NumberOfDigitNums +=1;
                count = 0;
            }
            else
            {
                count = 0;

            }
        }
        return NumberOfDigitNums;
    }
}