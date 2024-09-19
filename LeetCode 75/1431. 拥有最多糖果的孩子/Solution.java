import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> ans = new ArrayList<Boolean>();
        for (int i = 0; i < n; i++) {
            ans.add(ifMax(candies, candies[i] + extraCandies));
        }
        return ans;

    }

    public static boolean ifMax(int[] candies, int afterCandies) {
        // 判断afterCandies是否是candies数组中最大的
        for (int i = 0; i < candies.length; i++) {
            if (afterCandies < candies[i]) {
                return false;
            }
        }
        return true;
    }
}