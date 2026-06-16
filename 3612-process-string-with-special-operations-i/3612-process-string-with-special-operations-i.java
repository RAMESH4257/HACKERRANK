class Solution {
    public String processStr(String s) {
         StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>=97 && ch<=122){
                sb.append(ch);
            }else if(ch=='*'){
                if(sb.length()>0){
                  sb.deleteCharAt(sb.length()-1);
                }
            }else if(ch=='#'){
                sb.append(sb);
            }else if(ch=='%'){
                sb.reverse();
            }
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna