class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int last = m+n-1; //calculate last position of nums1
        while(m>0 && n>0){
           if(nums1[m-1]>nums2[n-1]){  //compare from both arrays starting from last real values
               nums1[last]=nums1[m-1];
               m -= 1;
               
           } else{
               nums1[last]=nums2[n-1];
                   n -= 1;
               
           }
           last -= 1; 
        }
        
        while(n>0){                    //edge case if nums2 is still not empty then put the elemments as it is in nums1
            nums1[last]=nums2[n-1];
            last -= 1;
            n -= 1;
        }
        
    }
}