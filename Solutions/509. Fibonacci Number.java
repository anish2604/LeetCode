class Solution {
    public int fib(int n) {
        int n1=0, n2=1,i;
        if(n==0)
            return 0;
        else if(n==1)
            return 1;  
        else{
            for(i=2;i<=n;++i)
            {
                int sum = n2;
                n2 = n1 + n2;    
                n1 = sum;    
            } 
        }
        return n2;
    }
}
