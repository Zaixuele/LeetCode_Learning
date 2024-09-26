import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length, index1 = 0, index2 = n - 1, sum = 0, count = 0;
        
        while (index1 < index2) {
            sum = nums[index1] + nums[index2];

            if (sum == k) {
                count++;
                index1++;
                index2--;
            } else if (sum < k) {
                index1++;
            } else {
                index2--;
            }
        }
        return count;
    }
}