class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
       for(int i=low;i<=high;i++) {
           int a=i;
           //if(a%2!=0) continue;
           //if(a)
           String s=Integer.toString(a);
           int le=s.length();
           if(le%2!=0) continue;
           int m=le/2;
           int sum1=0;
           int sum2=0;
           for (int j = 0; j < m; j++) {
               char ch = s.charAt(j);
               int b = ch - '0';
               sum1 += b;
           }
           for (int j = m; j <le; j++) {
               char ch = s.charAt(j);
               int b = ch - '0';
               sum2 += b;
           }
           if(sum1==sum2){
               c++;
           }
       }
       return c;
    }
}