
class Solution {

    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0, left = 0;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || chars[i] != chars[i + 1]) {
                chars[write++] = chars[i];
                int num = i - left + 1;
                if (num > 1) {
                    int anchor = write;
                    while (num > 0) {
                        chars[write++] = (char) (num % 10 + '0');
                        num /= 10;
                    }
                    reverse(chars, anchor, write - 1);
                }
                left = i + 1;
            }
        }
        return write;
    }

    public void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
