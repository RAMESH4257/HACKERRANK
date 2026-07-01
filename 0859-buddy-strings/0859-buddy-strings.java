class Solution {
    public boolean buddyStrings(String s, String goal) {
       if(s.length()!=goal.length()) return false;
       if(s.equals(goal)){
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            if(hm.get(ch)>1) return true;
        }
        return false;
       }
       List<Integer> li=new ArrayList<>();
       for(int i=0;i<s.length();i++){
        char ch1=s.charAt(i);
        char ch2=goal.charAt(i);
        if(ch1!=ch2){
            li.add(i);
        }
       }
       if(li.size()!=2) return false;
       int i=li.get(0);
       int j=li.get(1);
       return s.charAt(i)==goal.charAt(j) && s.charAt(j)==goal.charAt(i);
            
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna