class Solution {
    public String frequencySort(String s) {
        // code here
          HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        // Collectios.sort()
        List<Map.Entry<Character,Integer>> li=new ArrayList<>(hm.entrySet());
        Comparator<Map.Entry<Character,Integer>> comp=(a,b) ->{
            if(a.getValue()!=b.getValue()){
                return a.getValue()-b.getValue();
            }
            return a.getKey().compareTo(b.getKey());
        };
        Collections.sort(li,comp);
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> mp:li){
            int cnt=mp.getValue();
            while(cnt>0){
                sb.append(mp.getKey());
                cnt--;
            }
        }
        return sb.toString();
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna