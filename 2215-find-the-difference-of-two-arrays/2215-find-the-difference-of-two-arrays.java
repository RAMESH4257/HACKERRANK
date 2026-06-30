class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        HashMap<Integer,Integer> hm1=new HashMap<>();
        HashMap<Integer,Integer> hm2=new HashMap<>();
        for(int i:nums1){
            hm1.put(i,hm1.getOrDefault(i,0)+1);
        }
        for(int i:nums2){
            hm2.put(i,hm2.getOrDefault(i,0)+1);
        }
        List<Integer> li1=new ArrayList<>();
        for(int i:hm1.keySet()){
            if( !hm2.containsKey(i)){
                li1.add(i);
            }
        }
        ans.add(new ArrayList<>(li1));
        li1.clear();
        for(int i:hm2.keySet()){
            if(!hm1.containsKey(i)){
                li1.add(i);
            }
        }
        ans.add(new ArrayList<>(li1));
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna