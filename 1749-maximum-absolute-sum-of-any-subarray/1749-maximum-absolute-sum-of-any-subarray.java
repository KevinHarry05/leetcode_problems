class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int curMax=0;
        int curMin=0;
        int max=0;
        int min=0;
        int ans=0;
        for(int num:nums){
            curMax=Math.max(num,curMax+num);
            max=Math.max(curMax,max);
            curMin=Math.min(num,curMin+num);
            min=Math.min(min,curMin);
            ans=Math.max(max,Math.abs(min));
        }
        return ans;
    }
}