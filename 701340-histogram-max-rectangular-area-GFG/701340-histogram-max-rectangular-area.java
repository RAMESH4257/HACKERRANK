class Solution {
    public static int getMaxArea(int arr[]) {
        // code here
         int max=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                int ele=st.pop();
                int nse=i;
                int pse=(st.isEmpty())?-1:st.peek();
                max=Math.max(max,arr[ele]*(nse-pse-1));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int ele=st.pop();
            int nse=arr.length;
            int pse=(st.isEmpty())?-1:st.peek();
            max=Math.max(max,arr[ele]*(nse-pse-1));
        }
        return max;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna