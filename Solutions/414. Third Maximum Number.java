class Solution {
    public int thirdMax(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);

        var list = new HashSet<Integer>();
        var minHeap = new PriorityQueue<Integer>();

        for (var num : nums)
            if (list.add(num)) {
                minHeap.add(num);
                if (minHeap.size() > 3)
                    list.remove(minHeap.poll());
            }
        return minHeap.size() < 3 ? Collections.max(minHeap) : minHeap.peek();
    }
}
