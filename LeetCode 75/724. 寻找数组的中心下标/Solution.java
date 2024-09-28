
class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int ans = pivotIndex(nums);
        System.out.print(ans);
    }

    public static int pivotIndex(int[] nums) {
        int left = 0, right = 0;
        for (int num : nums) {
            right += num;
        }
        for (int i = 0; i < nums.length; i++) {
            right -= nums[i];
            if (left == right) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}
