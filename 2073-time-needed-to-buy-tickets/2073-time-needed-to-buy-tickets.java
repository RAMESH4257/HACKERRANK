class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> qu=new LinkedList<>();
        int time=0;

        for(int i=0;i<tickets.length;i++){
            qu.add(new int[]{i,tickets[i]});
        }
        while(!qu.isEmpty()){
            int[] temp=qu.remove();
            int idx=temp[0];
            int remain=temp[1];
            remain--;
            time++;
            if(idx==k && remain==0){
                return time;
            }
            if(remain>0){
                qu.add(new int[]{idx,remain});
            }
        }
        return time;
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna