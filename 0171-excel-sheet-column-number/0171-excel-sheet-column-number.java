class Solution {
    public int titleToNumber(String s) {
        int result=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int val=c-'A'+1;
            result=result*26+val;
        }
        return result;
    
    }
}