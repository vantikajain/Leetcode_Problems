class Solution {
    public int removeElement(int[] nums, int val) {
       int count = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[++count]=nums[i];
            }
        }
        return count+1;
    }
}