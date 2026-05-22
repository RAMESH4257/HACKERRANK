class BrowserHistory {
    Stack<String> forward;
    Stack<String> backward;
    String current;

    public BrowserHistory(String homepage) {
        forward=new Stack<>();
        backward=new Stack<>();
        current=homepage;
    }
    
    public void visit(String url) {
        backward.push(current);
        current=url;
        forward.clear();
    }
    
    public String back(int steps) {
        while(steps>0 && !backward.isEmpty()){
            forward.push(current);
            current=backward.pop();
            steps--;
        }
        return current;
    }
    
    public String forward(int steps) {
        while(steps>0 && !forward.isEmpty()){
            backward.push(current);
            current=forward.pop();
            steps--;
        }
        return current;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna