public class Solution {
    public static void main(String[] args) {
        int[] nums = { 1,0,1,0};
        boolean ans = canJump(nums);
        System.out.println(ans);
    }

    public static boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        int far = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (far < i) {
                break;
            }
            far = Math.max(far, i + nums[i]);
        }
        return far >= nums.length - 1;
    }
}
