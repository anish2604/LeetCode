# Using Hash Map

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



# Using Brute Force

class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0;i<nums.length;i++){
            for (int j = i+1;j<nums.length;j++)
                if (Math.abs(nums[j]-nums[i]) == k) count++;
        }
        return count;
    }
}
