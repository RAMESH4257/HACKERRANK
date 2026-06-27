class Solution {
    // Function to check if we can reach the last index from the 0th index.
    public boolean canReach(int[] arr) {
        // code here

        int maxidx=0;
        for(int i=0;i<arr.length;i++){
            if(i>maxidx) return false;
            maxidx=Math.max(maxidx,i+arr[i]);
        }
        return true;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna