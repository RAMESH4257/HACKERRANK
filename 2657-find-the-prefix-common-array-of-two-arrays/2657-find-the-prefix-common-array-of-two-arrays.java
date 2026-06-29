class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
int[] ans = new int[A.length];
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();

        int c = 0;

        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            int b = B[i];

            hm1.put(a, 1);
            if (hm2.containsKey(a)) {
                c++;
            }

            hm2.put(b, 1);

            if (a == b) {
                c++;
            } else if (hm1.containsKey(b)) {
                c++;
            }

            ans[i] = c;
         
       }
       return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna