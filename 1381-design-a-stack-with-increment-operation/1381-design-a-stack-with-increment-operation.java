class CustomStack {
    static int limit;
    static Stack<Integer> te;
    public CustomStack(int maxSize) {
        limit=maxSize;
        te=new Stack<>();
    }
    
    
    public void push(int x) {
        if(te.size()<limit){
            te.add(x);
        }
    }
    //static int cnt
    public int pop() {
        if(!te.isEmpty()){
            return te.pop();
        }
        return -1;
        
    }
    
    public void increment(int k, int val) {
        int min=Math.min(te.size(),k);
        for(int i=0;i<min;i++){
            te.set(i,te.get(i)+val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna