class Solution {
    public long sumAndMultiply(int n) {
        String s=String.valueOf(n);
        long sum=0;
        long num=0;
        for(char ch:s.toCharArray()){
            if(ch!='0'){
                sum+=(ch-'0');
                num=num*10+(ch-'0');
            }
        }
        return num*sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna