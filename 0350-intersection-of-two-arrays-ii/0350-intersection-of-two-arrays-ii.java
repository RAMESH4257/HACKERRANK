class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        // Step 1: Count frequency of nums1
        for (int n : nums1) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

        // Step 2: Check nums2 and add common elements
        for (int n : nums2) {
            if (hm.containsKey(n) && hm.get(n) > 0) {
                list.add(n);
                hm.put(n, hm.get(n) - 1); // decrease count
            }
        }

        // Step 3: Convert ArrayList to array
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}