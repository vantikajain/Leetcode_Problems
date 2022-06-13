class Solution {
    public int maxArea(int[] height) {
        //Two Pointer approach//
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        for(int i=0;i<height.length;i++){
            if(height[left]<height[right]){
                maxarea=Math.max(maxarea,(right-left)*height[left]);
                left++;
            }else{
                maxarea=Math.max(maxarea,(right-left)*height[right]);
                right--;
            }
        }
        return maxarea;
    }
}