class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int min = Math.min(m, n);
        int max = Math.max(m, n);

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < min; i++) {
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
        }

        String tail = m == max ? word1 : word2;
        for (int i = min; i < max; i++) {
            ans.append(tail.charAt(i));
        }

        return ans.toString();
    }
}