
class Solution {

    public static void main(String[] args) {
        String hayString = "abc";
        String needle = "c";
        int ans = strStr(hayString, needle);
        System.out.println(ans);
    }

    public static int strStr(String haystack, String needle) {
        int start = 0, flag = 0;
        int end = needle.length();
        if (haystack.length() < needle.length()) {
            return -1;
        }
        do {
            if (haystack.charAt(start) == needle.charAt(0)) {
                for (int i = 0; i < end; i++) {
                    if (needle.charAt(i) == haystack.charAt(start + i)) {
                        flag = 1;
                    } else {
                        flag = 0;
                        start++;
                        break;
                    }
                }
            } else {
                start++;
            }
        } while (flag != 1 && (start + end) <= haystack.length());

        if (flag == 1) {
            return start;
        } else {
            return -1;
        }
    }
}
