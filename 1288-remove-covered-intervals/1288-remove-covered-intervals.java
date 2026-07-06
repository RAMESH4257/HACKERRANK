class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int c=0;
        for(int i=0;i<intervals.length;i++){
            boolean ans=false;
            for(int j=0;j<intervals.length;j++){
                if(i==j) continue;
                if(intervals[i][0]>=intervals[j][0] && intervals[i][1]<=intervals[j][1]){
                    ans=true;
                }
            }
            if(ans==false){
                c++;
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna