class Solution {
    public int lengthOfLastWord(String s) {
         String[] s1 = s.split(" ");        //split on the basis of space
        return s1[s1.length-1].length();    // return length of last element
        
    }
}