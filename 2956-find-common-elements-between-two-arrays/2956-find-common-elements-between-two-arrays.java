class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> hs1=new HashSet<>();
        Set<Integer> hs2=new HashSet<>();
        for(int i:nums1){
            hs1.add(i);
        }
        for(int i:nums2){
            hs2.add(i);
        }
        int c=0,c2=0;
        for(int i:nums1){
            if(hs2.contains(i)){
                c++;
            }
        }
        for(int i:nums2){
            if(hs1.contains(i)){
                c2++;
            }
        }
        return new int[]{c,c2};

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna