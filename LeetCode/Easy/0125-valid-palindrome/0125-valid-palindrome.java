class Solution {
    public boolean isPalindrome(String s) {
        String str;
        str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
        String t = new StringBuilder(str).reverse().toString();
        
        return str.equals(t);
    }
}