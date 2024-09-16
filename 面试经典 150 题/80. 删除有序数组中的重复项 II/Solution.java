class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int now = 0;
        int time = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[now] != nums[i]) {
                now++;
                count++;
                nums[now] = nums[i];
                time = 0;
            } else {
                time++;
                if (time < 2) {
                    count++;
                    now++;
                    nums[now] = nums[i];
                } else {
                    continue;
                }
            }
        }
        return count;
    }
}