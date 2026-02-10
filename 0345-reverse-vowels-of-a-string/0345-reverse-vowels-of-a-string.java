class Solution {
    public String reverseVowels(String s) {
        char[] word=s.toCharArray();
        int start=0;
        int end =s.length()-1;
        String vowel="AEIOUaeiou";
        while(start<end)
        {
            while(start<end && vowel.indexOf(word[start])==-1)//-1 na true ,1 na false aagum then stop agidum
            {
                start++;
            }
            while(start<end && vowel.indexOf(word[end])==-1)
            {
                end--;
            }
            char temp=word[start];
            word[start]=word[end];
            word[end]=temp;
            start++;
            end--;
        }
        String result=new String(word);
        return result;
        
    }
}