class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st=new Stack<>();
        Deque<Integer> qu=new LinkedList<>();
        for(int i=sandwiches.length-1;i>=0;i--){
              st.push(sandwiches[i]);
        }
        for(int i:students){
            qu.add(i);
        }
        int rotations=0;
        int idx=0;
        while(!qu.isEmpty() && rotations<qu.size()){
            if(qu.peek()==sandwiches[idx]){
                qu.removeFirst();
                idx++;
                rotations=0;
            }
            else{
                qu.addLast(qu.removeFirst());
                rotations++;
            }
        }
        return qu.size();

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna