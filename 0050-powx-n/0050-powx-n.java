class Solution {
    public double pow(double x,long n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return pow(x*x,n/2);
        }
        else{
            return x*pow(x*x,(n-1)/2);
        }
    }
    public double myPow(double x, int n) {
        if(x==0){
            return 0;
        }
        long N=n;
        double result=pow(x,Math.abs(N));
        if(n<0){
            return 1/result;
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna