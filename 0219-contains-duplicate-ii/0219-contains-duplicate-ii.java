class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean isValid = false;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];

            if (map.containsKey(val)) {
                if (i - map.get(val) <= k) {
                    isValid = true;
                    break;
                }
            }
            map.put(val, i); // update last index
        }
        return isValid;
    }
}