/*
 * LeetCode 2011 - Final Value of Variable After Performing Operations
 *
 * Approach:
 * - Initialize the variable X to 0.
 * - Traverse each operation in the array.
 * - If the operation is "X++" or "++X", increment X.
 * - Otherwise, decrement X.
 * - Return the final value of X.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int X = 0;
        String incriment1 = "X++";
        String incriment2 = "++X";
        for(int i = 0 ; i < operations.length ; i++)
        {
            if(operations[i].equals(a) || operations[i].equals(b))
            {
                X = X + 1;
            }
            else
            {
                X = X - 1;
            }
        }
        return X;
    }
}