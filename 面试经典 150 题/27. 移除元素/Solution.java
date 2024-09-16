class Solution {

    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int end = length - 1;
        int k = 0;
        for (int i = 0; i <= end; i++) {
            if (nums[i] == val) {
                k++;
                nums[i] = nums[end];
                nums[end] = 101;
                end--;
                i--;

            }
        }
        return (length - k);
    }
}