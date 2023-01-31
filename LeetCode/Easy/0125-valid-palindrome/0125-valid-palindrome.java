class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        
        String t = "";
        t = new StringBuilder(s).reverse().toString();
        if(s.equals(t)){
            return true;
        }else{
            return false;
        }
        
    }
}