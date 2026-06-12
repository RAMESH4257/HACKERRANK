class Solution {
     public static void helper(int idx,String ans,int[] arr,ArrayList<String> li){
        if(idx==arr.length){
            li.add(ans);
            return;
        }
        String[] combo=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int number=arr[idx];
        if(number==0 || number==1){
        helper(idx+1,ans,arr,li);
        return;
    }
        String temp=combo[number];
        for(int i=0;i<temp.length();i++){
            helper(idx+1,ans+temp.charAt(i),arr,li);
        }

    }
    public ArrayList<String> possibleWords(int[] arr) {
        // code here
        ArrayList<String> li=new ArrayList<>();
        helper(0,"",arr,li);
        return li;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna