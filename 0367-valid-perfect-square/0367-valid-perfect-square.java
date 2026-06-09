class Solution {
    public boolean check(long lim,int n){
        if((lim*lim)>n){
            return false;
        }
        return true;
    }
    public boolean isPerfectSquare(int num) {
        long low=1,high=num;
        while(low<=high){
            long mid=low+(high-low)/2;
            if((mid*mid)==num){
                return true;
            }
            
            if(check(mid,num)){
    
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna