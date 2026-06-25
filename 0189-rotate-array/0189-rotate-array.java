class Solution {
    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        int n= nums.length;
        k=k%n;
        for(int i=n-k;i<n;i++){
            res[i-(n-k)]=nums[i];
        }
        for(int i=0;i<n-k;i++){
            res[i+k]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=res[i];
        }
    }
}