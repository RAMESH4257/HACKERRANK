class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> qu=new LinkedList<>();
        for(int i=0;i<deck.length;i++){
            qu.add(i);
        }
        int[] ans=new int[deck.length];
        for(int i=0;i<deck.length;i++){
            int idx=qu.remove();
            ans[idx]=deck[i];
            if(!qu.isEmpty()){
              int a=qu.remove();
              qu.add(a);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna