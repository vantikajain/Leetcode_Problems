class Solution {
    public void reverseString(char[] s) {
        
       int i=0;
        int j=s.length-1;
        while(i<j){
           // Swap(s[i],s[j]);
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
        
    
    // static void Swap(char a,char b){
    //        char temp = a;
    //         a=b;
    //         b=temp;
    //     }
}
