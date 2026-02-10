class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
            }
        }
        int[] ans=new int[set.size()];
        int i=0;
        for(int num:set)
        {
            ans[i]=num;
            i++;
        }
        Arrays.sort(ans);
          if(ans.length<3)
        {
            return ans[ans.length-1];
        }
        return ans[ans.length-3];  
    }
}