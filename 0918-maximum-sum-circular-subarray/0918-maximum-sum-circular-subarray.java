class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int maxSum = nums[0];
        int curMax = 0;
        int minSum = nums[0];
        int curMin = 0;
        for(int num:nums){
            curMax=Math.max(num,curMax+num);
            maxSum=Math.max(maxSum,curMax);
            curMin=Math.min(num,curMin+num);
            minSum=Math.min(curMin,minSum);
            total+=num;
        }
        if(maxSum<0){
            return maxSum;
        }
        return Math.max(maxSum,total-minSum);
        
    }
}