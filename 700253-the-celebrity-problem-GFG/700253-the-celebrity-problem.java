class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n=mat.length;
        int[] knowme=new int[n];
        int[] iknow=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                if(mat[i][j]==1){
                    knowme[j]++;
                    iknow[i]++;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(knowme[i]==n-1 && iknow[i]==0){
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna