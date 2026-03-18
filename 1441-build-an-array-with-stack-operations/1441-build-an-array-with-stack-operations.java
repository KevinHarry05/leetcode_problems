class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result= new ArrayList<>();
        int j=0;
        for(int i=1;i<=n;i++)
        {
            result.add("Push");
            if(i==target[j])
            {
                j++;
                if(j==target.length) break;
            }
                else{
                    result.add("Pop");
                }
            }
        return result;
    }
}