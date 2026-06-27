class Solution {
    public int maxChildren(int[] greed, int[] cookie) {
        // code here
        Arrays.sort(greed);
        Arrays.sort(cookie);
        int i=0,j=0;
        while(i<cookie.length && j<greed.length){
            if(cookie[i]>=greed[j]){
                j++;
            }
            i++;
        }
        return j;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna