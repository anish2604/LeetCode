class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
           return false;
        else
        {
            int result = 0;
            for(int i=x; i>0; i/=10)
                result = result*10 + i%10;
            if(result == x)
                return true;
            else
                return false;
        }
    }
}
