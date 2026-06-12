class Solution {
    public void helper(int idx,String ans,String di,List<String> li){
        if(idx==di.length()){
            li.add(ans);
            return;
        }
        String[] combo=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int number=di.charAt(idx)-'0';
        String temp=combo[number];
        for(int i=0;i<temp.length();i++){
            helper(idx+1,ans+temp.charAt(i),di,li);
        }

    }
    public List<String> letterCombinations(String digits) {
        List<String> li=new ArrayList<>();
        helper(0,"",digits,li);
        return li;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna