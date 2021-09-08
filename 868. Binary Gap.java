class Solution {
    public int binaryGap(int n) {
        if(n < 3)
            return 0; 
        int currGap = 1;
        int ans = 1;
        int pow = 1;
        while(n > pow) {
            pow *= 2;
        }
        if(n == pow)
            return 0;
        pow /= 2;
        while(pow > 0) {
            if(n >= pow) {
                ans = Math.max(ans,currGap);
                currGap = 1;
                n -= pow;
            } else
                currGap++;
            pow /= 2;
        }
        return ans;
    }
}
