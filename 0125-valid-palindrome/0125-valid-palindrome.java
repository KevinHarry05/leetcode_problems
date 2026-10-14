class Solution {
    public boolean isPalindrome(String s) {
        String b = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String rev = new StringBuilder(b).reverse().toString();
        return b.equals(rev);

    }
}