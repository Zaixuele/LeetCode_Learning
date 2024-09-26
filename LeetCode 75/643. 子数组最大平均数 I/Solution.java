
class Solution {

    public static void main(String[] args) {
        int[] nums = {5};
        int k = 1;
        double avg = findMaxAverage(nums, k);
        System.out.println(avg);
    }

    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            maxSum = sum;
        }

        for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(sum, maxSum);
        }
        double avg = ((double) maxSum / k);
        return avg;

    }
}
