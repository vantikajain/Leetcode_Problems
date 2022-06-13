class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid=low+(high-low)/2;
        while(low<high){
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                high=mid-1;
                mid=low+(high-low)/2;
                
            }else{
                low=mid+1;
                mid=low+(high-low)/2;
            }
        }
        
        if(nums[mid]<target){      //if target is greater than the last value//
            return mid+1;
        }else{
            return mid;
        }
    }
         
    }
