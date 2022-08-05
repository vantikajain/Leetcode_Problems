class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        
         if(k >= nums.length)
        k = k % nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    
}
  
        public static void reverse(int[] arr , int i , int j)
{
    while(i < j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
  }
}
}

  // public static void reverse(int[] arr,int q,int index){
//         int temp=0;
        
//          for (int i = index; i < (q) / 2; i++) {
//             temp = arr[i];
//             arr[i] = arr[q - i - 1];
//             arr[q - i - 1] = temp;
//          }
//         }