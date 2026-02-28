

class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        
        int i = 0;
        int j = arr2.length - 1;
        
        int minDiff = Integer.MAX_VALUE;
        ArrayList<Integer> result = new ArrayList<>();

        while(i < arr1.length && j >= 0) {
            
            int sum = arr1[i] + arr2[j];
            int diff = Math.abs(x - sum);

            if(diff < minDiff) {
                minDiff = diff;
                result.clear();
                result.add(arr1[i]);
                result.add(arr2[j]);
            }

            if(sum > x) {
                j--;
            } else {
                i++;
            }
        }

        return result;
    }
}