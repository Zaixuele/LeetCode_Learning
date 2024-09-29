
class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String ans = strs[0];
        for (String str : strs) {
            while (!str.startsWith(ans)) {
                if (ans.length() == 0) {
                    return "";
                }
                ans = ans.substring(0, ans.length() - 1);
            }
        }
        return ans;
    }
}
