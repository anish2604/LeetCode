class Solution {
    public int[] sumZero(int n) {
        int[] nums=new int[n];
        if(n%2==1)
            nums[n/2]=0;
        int j=1;
        for(int i=n/2-1;i>=0;i--, j++)
        {
            nums[i]=-1*j;
            nums[n-i-1]=j;
        }
        return nums;
    }
}
