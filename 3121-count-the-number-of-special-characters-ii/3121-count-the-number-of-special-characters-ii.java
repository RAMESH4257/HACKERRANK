class Solution {
    public int numberOfSpecialChars(String word) {
       int[] lastlower=new int[26];
       int[] firstupper=new int[26];
       Arrays.fill(lastlower,-1);
       Arrays.fill(firstupper,-1);
       for(int i=0;i<word.length();i++){
        char ch=word.charAt(i);
        if(ch>='a' && ch<='z'){
            lastlower[ch-'a']=i;
        }else{
            int idx=ch-'A';
            if(firstupper[idx]==-1){
                firstupper[idx]=i;
            }
        }
       }
       int c=0;
       for(int i=0;i<26;i++){
        if(lastlower[i]!=-1 && firstupper[i]!=-1 && lastlower[i]<firstupper[i]){
            c++;
        }
       }
       return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna