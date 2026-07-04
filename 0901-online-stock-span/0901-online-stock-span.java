class StockSpanner {
    List<Integer> li;
    public StockSpanner() {
        li=new ArrayList<>();
    }
    
    public int next(int price) {
        li.add(price);
        int curr=1;
        for(int i=li.size()-2;i>=0;i--){
            if(li.get(i)<=price){
                curr++;
            }else{
                break;
            }
        }
        return curr;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna