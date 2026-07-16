// import java.util.HashMap;
// public class Solution {
//     public int subarraySum(int[] nums, int k) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         map.put(0, 1);
//         int preSum = 0;
//         int count = 0;
//         for (int i = 0; i < nums.length; i++) {
//             preSum += nums[i];
//             int remove = preSum - k;
//             count += map.getOrDefault(remove, 0);
//             map.put(preSum, map.getOrDefault(preSum, 0) + 1);
//         }
//         return count;
//     }
// }
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}