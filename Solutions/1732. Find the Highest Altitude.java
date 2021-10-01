class Solution {
    public int largestAltitude(int[] gain) {
        int sum = gain[0];
        int max = Math.max(sum, 0);
        for (int i = 1; i < gain.length; i++) {
            sum += gain[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}
