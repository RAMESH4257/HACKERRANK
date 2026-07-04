class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
       ArrayList<Integer> ans=new ArrayList<>();
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<arr.length;i++){
        while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
            st.pop();
        }
        ans.add(i-((st.isEmpty())?-1:st.peek()));
        st.push(i);
       }
       return ans;
    //   ArrayList<Integer> li=new ArrayList<>();
    //   for(int i=0;i<arr.length;i++){
    //     int currspan=0;
    //     for(int j=i;j>=0;j--){
    //         if(arr[j]<=arr[i]){
    //             currspan++;
    //         }else{
    //             break;
    //         }
    //     }
    //     li.add(currspan);
    //   }
    //   return li;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna