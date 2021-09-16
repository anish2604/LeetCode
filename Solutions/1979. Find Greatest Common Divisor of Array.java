class Solution {
    public int findGCD(int[] nums) {
        int large = 0;
        int small = 1001;
        for (int n : nums) { 
            large = Math.max(large,n);
            small = Math.min(small,n);
        }
        int gcd = 0;
        for (int i = 1; i <= small; i++) {
            if (small % i == 0 && large % i == 0) {
                gcd = Math.max(gcd, i);
            }
        }
        return gcd;
    }
}
