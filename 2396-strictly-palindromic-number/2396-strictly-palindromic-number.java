class Solution {
    public boolean isStrictlyPalindromic(int n) {
       if(n>4){
            return false;
        }
        String binary=Integer.toBinaryString(n);
        StringBuilder sb=new StringBuilder(binary);
        String ans=sb.reverse().toString();
        return ans.equals(binary); 
    }
}