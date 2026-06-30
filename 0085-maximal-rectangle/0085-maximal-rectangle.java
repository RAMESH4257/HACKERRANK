class Solution {
    public int lhist(int[] arr){
        Stack<Integer> st=new Stack<>();
        int max=0;
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
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;int m=matrix[0].length;
        int[][] premat=new int[n][m];
        for(int j=0;j<m;j++){
            int sum=0;
            for(int i=0;i<n;i++){
                if(matrix[i][j]=='0'){
                    sum=0;
                }else{
                    sum++;
                }
                premat[i][j]=sum;
            }
        }
        int maxArea=0;
        for(int i=0;i<n;i++){
            maxArea=Math.max(maxArea,lhist(premat[i]));
        }
        return maxArea;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna