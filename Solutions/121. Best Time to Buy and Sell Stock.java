class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int min = Integer.MAX_VALUE;
        for (int i : prices) {
            min = Math.min(min, i);
            res = Math.max(res, i - min);
        }
        return res;
    }
}
