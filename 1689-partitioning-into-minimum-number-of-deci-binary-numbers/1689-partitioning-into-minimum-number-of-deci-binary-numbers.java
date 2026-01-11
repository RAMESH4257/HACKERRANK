class Solution {
    public int minPartitions(String n) {
        //String n=sc.nextLine();
       int max=0;
      for(int i=0;i<n.length();i++){
          char ch=n.charAt(i);
          int a=ch-'0';
          max=Math.max(a,max);
      }
      return max;
    }
}