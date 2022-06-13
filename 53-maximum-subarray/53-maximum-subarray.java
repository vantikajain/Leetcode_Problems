class Solution {
    public int maxSubArray(int[] nums) {
        //Kadane's Algo//
        int Maxsum=Integer.MIN_VALUE;         
        int curr=0;
        for(int i=0;i<nums.length;i++){
          curr=curr+nums[i];
            if(curr>Maxsum){
                Maxsum=curr;
            }if(curr<0){
                curr=0;
            }
        }
        return Maxsum;
    }
}