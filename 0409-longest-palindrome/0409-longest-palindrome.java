class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int length=0;
        for(char c:s.toCharArray())
        {
            if(set.contains(c))
            {
                set.remove(c);
                {
                    length+=2;
                }
            }
            else
            {
                set.add(c);
            }
        }
        if(!set.isEmpty())
        {
            length++;
        }
        return length;
    }
}