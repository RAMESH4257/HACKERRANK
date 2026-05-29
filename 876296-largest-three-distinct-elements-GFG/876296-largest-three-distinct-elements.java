class Solution {
    public int[] getThreeLargest(int arr[]) {
        // code here
        int a=Integer.MIN_VALUE;
        int b=Integer.MIN_VALUE;
        int c=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>a){
                a=x;
            }
        }
        for(int x:arr){
            if(x>b && x!=a){
                b=x;
            }
        }
        for(int x:arr){
            if(x>c && x!=a && x!=b){
                c=x;
            }
        }
        Set<Integer> hs=new LinkedHashSet<>();
        if(c!=Integer.MIN_VALUE){
            hs.add(c);
        }
        if(b!=Integer.MIN_VALUE){
            hs.add(b);
        }
        if(a!=Integer.MIN_VALUE){
            hs.add(a);
        }
        int[] ans=new int[hs.size()];
        int idx=0;
        for(int i:hs){
            ans[idx++]=i;
        }
        Arrays.sort(ans);
        int[] temp=new int[ans.length];
        idx=0;
        for(int i=ans.length-1;i>=0;i--){
            temp[idx++]=ans[i];
        }
        return temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna