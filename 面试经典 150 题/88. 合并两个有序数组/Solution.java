class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1, b = n - 1;
        int end = m + n - 1;
        int tmp = 0;

        while (a >= 0 || b >= 0) {
            if (a == -1) {
                tmp = nums2[b--];
            } else if (b == -1) {
                tmp = nums1[a--];
            } else if (nums1[a] >= nums2[b]) {
                tmp = nums1[a--];
            } else {
                tmp = nums2[b--];
            }
            nums1[end--] = tmp;
        }
    }
}