class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            map.put(c,map.getOrDefault(c,0));
            if(map.containsKey(c)){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        int len = ransomNote.length(); 
        int count =0;
        for(int j=0;j<len;j++){
            char p = ransomNote.charAt(j);
            if(map.containsKey(p)){
               // map.remove(p);
                   if(map.get(p)>0){
                    map.put(p,map.getOrDefault(p,1)-1);
                    count++;
                
                   }
            }
        }
        return count==len?true:false;
    }
}