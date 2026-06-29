class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            min=Math.min(i,min);
            max=Math.max(i,max);
            hs.add(i);
        }
        List<Integer> li=new ArrayList<>();
        while(min<=max){
             if(!hs.contains(min)){
                li.add(min);
             }
             min++;
        }
        return li;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna