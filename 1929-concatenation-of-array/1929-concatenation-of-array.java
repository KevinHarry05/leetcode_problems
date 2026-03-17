class Solution {
    public int[] getConcatenation(int[] nums) {
    int n=nums.length;
    int result[] =new int[n*2];
    for(int i=0;i<nums.length;i++)
    {
        result[i]=nums[i];
    }
    for(int i=0;i<nums.length;i++)
    {
        result[i+n]=nums[i];
    }
    return result;
    }
}