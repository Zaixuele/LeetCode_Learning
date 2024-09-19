class Solution {
    public int majorityElement(int[] nums) {
        // 时间复杂度O(Nlogn),没有满足进阶要求：时间复杂度为O(n)
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}





























