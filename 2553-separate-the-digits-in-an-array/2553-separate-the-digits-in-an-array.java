class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        int idx=0;
        for(int i=0;i<nums.length;i++){
            //Stack<Integer> st=new Stack<>();
            int n=nums[i];
            String s=Integer.toString(n);
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                int ans=ch-'0';
                li.add(ans);
            }
        }
        int[] ans=new int[li.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=li.get(i);
        }
        return ans;
    }
}