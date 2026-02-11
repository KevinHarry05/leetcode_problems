class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String a =s+s;
        String b=a.substring(1,a.length()-1);
        return b.contains(s);
        
    }
}