
class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0, cur = 0;
        for (int i = 0; i < gas.length; i++) {
            cur += gas[i] - cost[i];
            if (cur < 0) {
                start = i + 1;
                cur = 0;
            }
        }

        for (int i = 0; i < start; i++) {
            cur += gas[i] - cost[i];
            if (cur < 0) {
                return -1;
            }
        }
        return start;

    }
}
