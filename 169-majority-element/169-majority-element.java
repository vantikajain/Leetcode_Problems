class Solution {
    public int majorityElement(int[] nums) {
        //count frequency using hashmap
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>nums.length/2){
                ans = entry.getKey();
            }
        }
        return ans;
    }
}