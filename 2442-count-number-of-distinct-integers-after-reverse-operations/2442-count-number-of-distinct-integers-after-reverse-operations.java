class Solution {
    private int reverse(int num){
        int rev=0;
        while(num!=0){
            int k=num%10;
            rev=rev*10+k;
            num/=10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
            set.add(reverse(num));
        }

        return set.size();

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna