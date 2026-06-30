class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
        for(String s:arr){
           hm.put(s,hm.getOrDefault(s,0)+1);
        }
        int c=0;
        for(String s:hm.keySet()){
           if(hm.get(s)==1){
            k--;
            if(k==0){
                return s;
            }
           }
        }
        return "";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna