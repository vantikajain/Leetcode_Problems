class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        
        while(j<s.length()&&i<t.length()){
            char c1=t.charAt(i);
            char c2=s.charAt(j);
            
            if(c1==c2){
                i++;
                j++;
            }else{
                i++;
            }
        }
        if(j==s.length()){
            return true;
        }else{
            return false;
        }
    }
}