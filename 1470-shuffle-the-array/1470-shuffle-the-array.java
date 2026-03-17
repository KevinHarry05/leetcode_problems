class Solution {
    public int[] shuffle(int[] nums, int n) {
        int result[] = new int[nums.length];
        int k = 0;

        for (int i=0;i<nums.length-n;i++) {
            result[k++] = nums[i];

            for (int j=nums.length-n+i;j<=nums.length-n+i;j++) {
                result[k++] = nums[j];
            }
        }
        return result;
    }
}