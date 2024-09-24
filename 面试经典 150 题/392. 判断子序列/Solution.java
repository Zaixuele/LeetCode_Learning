class Solution {
    public static void main(String[] args) {
        String s = "b", t = "abc";
        boolean ans = isSubsequence(s, t);
        System.out.println(ans);
    }
    public static boolean isSubsequence(String s, String t) {
        int sub = 0;
        if (s.length() == 0) {
            return true;
        }
        for (int i = 0; i < t.length() && sub < s.length(); i++) {
            if (t.charAt(i) == s.charAt(sub)) {
                sub++;
            }
        }
        return sub == s.length();
    }
}