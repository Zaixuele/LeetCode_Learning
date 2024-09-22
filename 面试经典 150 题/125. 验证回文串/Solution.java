class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer raw = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                raw.append(Character.toLowerCase(ch));
            }
        }
        
        StringBuffer raw_rev = new StringBuffer(raw).reverse();
        return raw.toString().equals(raw_rev.toString());

    }
}