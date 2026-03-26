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
    public int pairSum(ListNode head) {
        if(head.next==null){
            return head.val;
        }
        if(head.next.next==null){
            return head.val+head.next.val;
        }
        ListNode temp=head;
        int c=1;
        while(temp.next!=null){
            c++;
            temp=temp.next;
        }
        temp=head;
        int[] ans=new int[c];
        int idx=0;
        while(temp!=null){
           ans[idx++]=temp.val;
           temp=temp.next;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<(c/2);i++){
            int sum=ans[i]+ans[c-1-i];
            max=Math.max(max,sum);
        }
        return max;
    }
}