class Solution {
    public int maxArea(int[] height) {
        int n = height.length, left = 0, right = n - 1;
        int ans = 0;
        while (left < right) {
            ans = Math.max((right - left) * Math.min(height[left], height[right]),ans);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}