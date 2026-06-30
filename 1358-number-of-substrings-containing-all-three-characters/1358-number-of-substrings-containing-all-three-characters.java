class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int l=0,ans=0;
        for(int r=0;r<s.length();r++){
           char ch=s.charAt(r);
           hm.put(ch,hm.getOrDefault(ch,0)+1);
           while(hm.containsKey('a') && hm.containsKey('b') && hm.containsKey('c')){
             ans+=s.length()-r;
             char leftchar=s.charAt(l);
             hm.put(leftchar,hm.get(leftchar)-1);
             if(hm.get(leftchar)==0){
                hm.remove(leftchar);
             }
             l++;
           }
        }
        return ans;
        // int c=0;
        // //Set<Character> st=new HashSet<>();
        // for(int i=0;i<s.length();i++){
        //      Set<Character> hs=new HashSet<>();
        //      StringBuilder sb=new StringBuilder();
        //     for(int j=i;j<s.length();j++){
        //         char ch=s.charAt(j);
        //         hs.add(ch);
        //         sb.append(ch);
        //         if(sb.length()>=3 && hs.contains('a') && hs.contains('b') && hs.contains('c')){
        //             c++;
        //         }
        //     }
        //     // hs.clear();
        //     // sb.setLength(0);
        // }
        // return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna