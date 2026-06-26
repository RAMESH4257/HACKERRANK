class Solution {
    public char findTheDifference(String s, String t) {
         if(s.length()==0) return t.charAt(0);
        HashMap<Character,Integer> hm1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch1=t.charAt(i);
           hm1.put(ch,hm1.getOrDefault(ch,0)+1);
           hm1.put(ch1,hm1.getOrDefault(ch1,0)+1);
        }
        char last=t.charAt(t.length()-1);
        hm1.put(last,hm1.getOrDefault(last,0)+1);
        char ans='r';
        int max=Integer.MIN_VALUE;
        for(char ch:hm1.keySet()){
            int a=hm1.get(ch);
            if(a==1){
                return ch;
            }else{
                if(a%2==1){
                   
                    ans=ch;
                    break;
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna