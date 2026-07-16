class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        int fir=1, sec=2;
        for(int i=3; i<=n; i++){
            int cur = fir+sec;
            fir = sec;
            sec = cur;
        }
        return sec;
    }
}
