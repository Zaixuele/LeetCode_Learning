
class Solution {

    public int maxVowels(String s, int k) {
        int left = 0, right = k;
        int max = 0, count = 0;
        for (int i = 0; i < k; i++) {
            char temp = s.charAt(i);
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
                count++;
            }
        }
        max = Math.max(max, count);

        while (right < s.length()) {
            char temp = s.charAt(right);
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
                count++;
            }
            right++;
            temp = s.charAt(left);
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
                count--;
            }
            max = Math.max(max, count);
            left++;
            if (max == k) {
                return max;
            }

        }

        return max;
    }

}
