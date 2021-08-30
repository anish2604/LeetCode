class Solution {
    public String convertToBase7(int num) {
        int pro=1,ans=0;
        while(num!=0){
            int rem=num%7;
            num/=7;
            ans+=rem*pro;
            pro*=10;
        }
        return Integer.toString(ans);
    }
}
