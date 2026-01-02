class Solution {
    public int repeatedNTimes(int[] nums) {
        int n= nums.length/2;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int k=nums[i];
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        for(int i: hm.keySet()){
            int a=hm.get(i);
            if(n==a){
                return i;
                //break;
            }
        }
        return -1;
    }
}