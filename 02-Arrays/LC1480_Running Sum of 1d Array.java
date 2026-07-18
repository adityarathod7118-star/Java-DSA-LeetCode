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