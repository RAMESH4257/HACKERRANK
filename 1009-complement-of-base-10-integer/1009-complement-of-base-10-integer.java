class Solution {
    public int bitwiseComplement(int n) {
          String a=Integer.toBinaryString(n);
        String temp="";
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(ch=='0'){
                temp+='1';
            }else{
                temp+='0';
            }
        }
        int ans=Integer.parseInt(temp,2);
        return ans;
    }
}