class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=nums.length-1;
        while(j>=i){
            if(nums[i] == val && nums[j]!=val){
                nums[i++] = nums[j--];
            }else if(nums[i] == val && nums[j] == val){
                j--;
            }else{
                i++;
            }
        }
        return i;
    }
}
