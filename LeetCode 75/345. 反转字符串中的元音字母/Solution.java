class Solution {
    public String reverseVowels(String s) {
        int len = s.length();
        char[] chars = s.toCharArray();
        int i = 0;
        int j = len - 1;
        while (i < j) {

            while (i < len && !isVowel(chars[i])) {
                i++;
            }

            while (j > 0 && !isVowel(chars[j])) {
                j--;
            }
            if (i < j) {
                swap(chars, i, j);
                i++;
                j--;
            }
        }
        return new String(chars);
    }

    public boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }
    public void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}