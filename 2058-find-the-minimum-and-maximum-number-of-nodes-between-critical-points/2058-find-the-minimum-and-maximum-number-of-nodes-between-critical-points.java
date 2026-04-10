/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next.next==null){
            return new int[]{-1,-1};
        }
        ListNode temp=head;
        // int a=temp.val;
        // int a=0;
        // int c=0;
        int size=0;
        ArrayList<Integer> li=new ArrayList<>();
        while(temp!=null){
           size++;
           temp=temp.next;
        }
        int[] arr=new int[size];
        temp=head;
        for(int i=0;i<arr.length;i++){
            arr[i]=temp.val;
            temp=temp.next;
        }
        for(int i=1;i<arr.length-1;i++){
          if(arr[i-1] < arr[i] && arr[i]>arr[i+1]){
            li.add(i);
          }
           if(arr[i-1]>arr[i] && arr[i]<arr[i+1]){
            li.add(i);
          }
        }
        if(li.size()<2){
            return new int[]{-1,-1};
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<li.size()-1;i++){
          min=Math.min(min,Math.abs(li.get(i)-li.get(i+1)));
          //max=Math.max(max,Math.abs(li.get(i)-li.get(i+1)));
        }
        max=Math.max(max,li.get(li.size()-1)-li.get(0));
        return new int[]{min,max}; 
    }
}