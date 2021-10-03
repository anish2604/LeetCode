class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(String str : operations){
            ans += str.charAt(1) == '+' ? 1 : -1;
        }
        return ans;
    }
}
