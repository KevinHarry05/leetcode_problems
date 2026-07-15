class Solution {
    public int pivotIndex(int[] nums) {

        for (int pivot = 0; pivot < nums.length; pivot++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int i = 0; i < pivot; i++) {
                leftSum += nums[i];
            }

            for (int i = pivot + 1; i < nums.length; i++) {
                rightSum += nums[i];
            }

            if (leftSum == rightSum) {
                return pivot;
            }
        }

        return -1;
    }
}