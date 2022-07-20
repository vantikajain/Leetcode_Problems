class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans= new int[nums.length];
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=i;j++){
              sum=sum+nums[j];  
            }
            ans[count]=sum;
            count++;
            sum=0;
        }
        return ans;
    }
}