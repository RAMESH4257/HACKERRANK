class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hs.add(ch);
        }
        return hs.size();
    }
}