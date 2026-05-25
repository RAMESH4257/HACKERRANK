class RecentCounter {
    Queue<Integer> qu;
    public RecentCounter() {
        qu=new LinkedList<>();
    }
    
    public int ping(int t) {
        qu.offer(t);
        while(qu.peek()<t-3000){
            qu.poll();
        }
        return qu.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna