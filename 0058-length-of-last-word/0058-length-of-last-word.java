class Solution {
    public int lengthOfLastWord(String s) {
        String[] words= s.split(" ");
        int n=words.length;
        String res= words[n-1];
        return res.length();
    }
}