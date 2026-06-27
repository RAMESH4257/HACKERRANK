class Solution {
    public boolean check(String a,String b){
        if(a.length()==0)
         return false;

    for(char ch : a.toCharArray()){
        if(!Character.isLetterOrDigit(ch) && ch!='_')
            return false;
    }

    return b.equals("electronics")
        || b.equals("grocery")
        || b.equals("pharmacy")
        || b.equals("restaurant");
    }
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String[]> li=new ArrayList<>();
        List<String> ans=new ArrayList<>();
        for(int i=0;i<code.length;i++){
            String a=code[i];
            String b=businessLine[i];
            boolean c=isActive[i];
            if(c && check(a,b)){
             li.add(new String[]{a,b});
            }
        }
        Comparator<String[]> comp=(a,b) ->{
            int c=a[1].compareTo(b[1]);
            if(c!=0){
                return c;
            }
            return a[0].compareTo(b[0]);
        };
        Collections.sort(li,comp);
        for(String[] s:li){
            ans.add(s[0]);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna