class Solution {
    public int maxProduct(int[] nums) {
        int curMax = nums[0];
        int curMin = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tempMax = curMax;

            curMax = Math.max(nums[i],
                    Math.max(nums[i] * curMax,
                             nums[i] * curMin));
            curMin = Math.min(nums[i],
                    Math.min(nums[i] * tempMax,
                             nums[i] * curMin));
            ans = Math.max(ans, curMax);
        }
        return ans;
    }
}