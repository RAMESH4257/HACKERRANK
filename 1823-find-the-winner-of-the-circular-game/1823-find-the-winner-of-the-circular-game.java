class Solution {
    public int findTheWinner(int n, int k) {
        if(n==1){
            return 1;
        }
        Queue<Integer> qu=new LinkedList<>();
        for(int i=1;i<=n;i++){
            qu.add(i);
        }
        int c=0;
        while(qu.size()!=1){
            while(!qu.isEmpty() && c!=k-1){
                qu.add(qu.remove());
                c++;
            }
            c=0;
            qu.remove();
        }
        return qu.remove();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna