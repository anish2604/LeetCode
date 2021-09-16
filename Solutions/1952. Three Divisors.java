class Solution {
    public boolean isThree(int n) {
        if(n == 1)
            return false;
        double sqrt = Math.sqrt(n);
        for(int i = 2; i < sqrt; i++) {
            if(n % i == 0) 
                return false;
        }
        if(sqrt == Math.floor(sqrt)) 
            return true;
        return false;
    }
}
