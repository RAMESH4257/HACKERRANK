class Solution {
    String removeSpaces(String s) {
        // code here
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                continue;
            }else{
                ans+=ch;
            }
        }
        return ans;
        
    }
}