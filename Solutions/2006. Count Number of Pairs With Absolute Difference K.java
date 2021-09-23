Using Hash Map

class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> pair = new HashMap<>();
        for (int i: nums){
            pair.put(i, pair.getOrDefault(i, 0)+1);
			count += pair.getOrDefault(i - k, 0) + pair.getOrDefault(i + k, 0);
        }
        return count;
    }
}
