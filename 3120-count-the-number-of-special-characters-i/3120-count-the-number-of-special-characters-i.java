class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> hs=new HashSet<>();
        for(char ch:word.toCharArray()){
            if(ch>=97){
                hs.add(ch);
            }
        }
        int c=0;
        for(char ch:word.toCharArray()){
            if(ch<97){
                int val=ch+32;
                char temp=(char)val;
                if(hs.contains(temp)){
                    c++;
                    hs.remove(temp);
                }
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna