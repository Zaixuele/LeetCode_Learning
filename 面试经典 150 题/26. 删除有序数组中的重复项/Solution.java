
class Solution {

    public int removeDuplicates(int[] nums) {
        int count = 1;
        int now = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[now] != nums[i]) {
                now++;
                nums[now] = nums[i];
                count++;
            }
        }
        return count;
    }
}