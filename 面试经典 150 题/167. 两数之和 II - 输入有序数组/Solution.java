import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        int[] ans = twoSum(numbers, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = { 0, 0 };
        int n = numbers.length, index1 = 0, index2 = n - 1, sum = 0;
        while (index1 < index2) {
            sum = numbers[index1] + numbers[index2];

            if (sum == target) {
                ans[0] = index1 + 1;
                ans[1] = index2 + 1;                
                break;
            }
            else if (sum < target) {
                index1++;
            }
            else {
                index2--;
            }

        }
        return ans;
    }
}