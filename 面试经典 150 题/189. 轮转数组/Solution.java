import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        System.out.println(Arrays.toString(nums));
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));

    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int count = gcd(k, n);

        for (int i = 0; i < count; i++) {
            int cur = i;
            int prev = nums[i];
            do {
                int next = (cur + k) % n;
                int tmp = nums[next];
                nums[next] = prev;
                prev = tmp;
                cur = next;
            } while (i != cur);

        }

    }

    public static int gcd(int x, int y) {
        return y > 0 ? gcd(y, x % y) : x;
    }
}
