class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sc=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
            {
                sb.append(Character.toUpperCase(ch));
            }
        }
        String res=sb.toString();
        int count=0;
        for(int i=res.length()-1;i>=0;i--)
        {
            sc.append(res.charAt(i));
            count++;
            if(count==k && i!=0)
            {
                sc.append('-');
                count=0;
            }
        }
        return sc.reverse().toString();
        
        
    }
}