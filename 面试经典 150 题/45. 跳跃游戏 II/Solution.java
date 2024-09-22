public class Solution {
    public static void main(String[] args) {
        int[] nums = { 2,0,0};
        int ans = jump(nums);
        System.out.println(ans);
    }

    public static int jump(int[] nums) {
        int start = 0;
        int end = nums[0];
        int next = 0;
        int count = 1;
        while (end < nums.length - 1) {
            for (int i = start; i <= end; i++) {
                next = Math.max(next, i + nums[i]);
            }
            start = end;
            end = next;
            count++;
        }
        if (nums.length == 1) {
            count = 0;
        }
        return count;
    }
}
        //     far = Math.max(far, i + nums[i]);
        //     count++;
        //     if (far >= nums.length - 1) {
        //         break;
        //     }

        //     for (int j = i+1    ; j <= far; j++) {
        //         next = Math.max(next, j + nums[j]);
        //     }
        //     if (next > far) {
        //         far = next;
        //         count++;
        //     }
        //     while (far < nums.length - 1 && nums[far] == 0) {
        //         far--;
        //     }
        //     i = far;
        // }
