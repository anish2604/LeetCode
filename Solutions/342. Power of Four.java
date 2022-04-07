class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1)
            return true;
        if(n <= 0 || n%4 != 0)
            return false;
        
        // Without using Recursion
        double k = Math.log(n)/Math.log(4);
        return Math.floor(k) == k;
        
        // Using Recursion
        // return isPowerOfFour(n>>2);
    }
}
