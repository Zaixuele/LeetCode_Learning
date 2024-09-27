
class Solution {

    public int largestAltitude(int[] gain) {
        int ans = 0, height = 0;
        for (int i = 0; i < gain.length; i++) {
            height += gain[i];
            ans = Math.max(height, ans);
        }
        return ans;
    }
}
