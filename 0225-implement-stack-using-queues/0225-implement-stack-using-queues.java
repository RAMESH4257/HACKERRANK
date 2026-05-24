class MyStack {
    Queue<Integer> q1;
    // Queue<Integer> q2;

    public MyStack() {
        q1=new LinkedList<>();
        // q2=new LinkedList<>();
    }

    public void push(int x) {
         //q1.add(x);
        q1.add(x);
         int size=q1.size()-1;
         for(int i=0;i<size;i++){
            q1.add(q1.remove());
         }
        //  while(!q1.isEmpty()){
        //      q2.add(q1.remove());
        //  }
        //  q1.add(x);
        // while(!q2.isEmpty()) {
        //     q1.add(q2.remove());
        // }
    }

    public int pop() {
        if(empty()){
            System.out.println("stack is empty");
            return -1;
        }
        return q1.remove();
    }

    public int top() {
                if(empty()){
            System.out.println("stack is empty");
            return -1;
        }
       return q1.peek();
    }

    public boolean empty() {
         return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna