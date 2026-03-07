class Solution {
    public int minFlips(String s) {
         int zero=0;
        int one=0;
        int l=0;
        String str=s+s;
        int n=s.length();
        int min=Integer.MAX_VALUE;
        for(int r=0;r<str.length();r++){
            // 010101
            char expected1;
            if(r%2==0){
                expected1='0';
            }else{
                expected1='1';
            }
            // 101010
            char expected2;
            if(r%2==0){
                expected2='1';
            }else{
                expected2='0';
            }
            if(str.charAt(r)!=expected1){
                zero++;
            }
            if(str.charAt(r)!=expected2){
                one++;
            }
            if(r-l+1>n){
                char expect1;
                
                if(l%2==0){
                      expect1='0';
                }else{
                    expect1='1';
                }
                char expect2;
                if(l%2==0){
                      expect2='1';
                }else{
                    expect2='0';
                }
                if(str.charAt(l)!=expect1){
                    zero--;
                }
                if(str.charAt(l)!=expect2){
                    one--;
                }
                l++;
            }
            if(r-l+1==n){
                 min=Math.min(min,Math.min(zero,one));
            }
        }
        return min;

    }
}