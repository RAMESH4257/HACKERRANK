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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null|| head.next.next==null){
            return;
        }
       ListNode slow=head;
       ListNode fast=head,temp=head;
       while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       ListNode second=slow.next;
       slow.next=null;

       //temp.next=null;
       ListNode prevnode=null,currnode=second,nextnode;
       while(currnode!=null){
        nextnode=currnode.next;
        currnode.next=prevnode;
        prevnode=currnode;
        currnode=nextnode;
      }
     temp=head;
      ListNode curr1=head,curr2=prevnode,link1=null,link2=null;
      while(curr2!=null){
        link1=curr1.next;
        link2=curr2.next;
        curr1.next=curr2;
        curr2.next=link1;
        curr1=link1;
        curr2=link2;
        //temp=link1;
      }
    }
}