class Solution {
    public int mySqrt(int x) {
        long i=1;
        int res=0;
    while(i*i<=x){
        res =(int)i;
        i++;
    }
        return res;
    }
}