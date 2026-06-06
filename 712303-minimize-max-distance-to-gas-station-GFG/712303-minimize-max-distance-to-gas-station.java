class Solution {
     public static int gasplaced(int[] arr,double gass){
        int c=0;
        for(int i=1;i<arr.length;i++){
            int numberInbetween=(int)((arr[i]-arr[i-1])/gass);
            if(arr[i]-arr[i-1]==(gass*numberInbetween)){
                numberInbetween--;
            }
            c+=numberInbetween;
        }
        return c;
    }
    public double minMaxDist(int[] stations, int K) {
        // code here
        double low=0;
        int max=Integer.MIN_VALUE;
        for(int i:stations){
            max=Math.max(i,max);
        }
        double high=(double)max;
        double lim=1e-6;
        double ans=0;
        while(high-low>lim){
            double mid=(low+high)/2.0;
            int cnt=gasplaced(stations,mid);
            if(cnt>K) low=mid;
            else{
                ans=mid;
                high=mid;
            }
        }
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna