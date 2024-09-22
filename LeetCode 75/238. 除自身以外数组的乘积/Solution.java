
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = { -1,1,0,-3,3,2,7};
        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        int before = 1, after = 1;
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            ans[i] *= before;
            ans[j] *= after;
            before *= nums[i];
            after *= nums[j];
        }
        return ans;
    }
}