class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> li=new ArrayList<>();
        HashMap<Integer,List<Integer>> hm=new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
             int a=groupSizes[i];
            if(hm.containsKey(a)){
                if(hm.get(a).size()!=a){
                    hm.get(a).add(i);
                }else{
                    li.add(hm.get(a));
                    hm.remove(a);
                     hm.put(a,new ArrayList<>());
                     hm.get(a).add(i);
                }
                
            }else{
                hm.put(a,new ArrayList<>());
                hm.get(a).add(i);
            }
        }
        for(List<Integer> i:hm.values()){
            li.add(i);
        }
        return li;
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna