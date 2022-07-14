class Solution {
    public boolean isPalindrome(String s) {
       s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        
        for(char ch : s.toCharArray()) {
            if(Character.isLetterOrDigit(ch))
                sb.append(ch);
        }
        
        s = String.valueOf(sb);
        String nstr="";
        
         for (int i=0; i<s.length(); i++)
      {
       char ch= s.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      if(nstr.equals(s)){
          return true;
      }
        return false;
    }
}