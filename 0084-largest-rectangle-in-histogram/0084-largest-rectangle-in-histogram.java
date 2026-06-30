class Solution {
    private int[] findpse(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
           while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
            st.pop();
           }
           ans[i]=(st.isEmpty())?-1:st.peek();
           st.push(i);
        }
        return ans;
    }
    private int[] findnse(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
             ans[i]=(st.isEmpty())?arr.length:st.peek();
            st.push(i);
        }
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        int[] pse=findpse(heights);
        int[] nse=findnse(heights);
        int max=0;
        for(int i=0;i<heights.length;i++){
            max=Math.max(max,(nse[i]-pse[i]-1)*heights[i]);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna