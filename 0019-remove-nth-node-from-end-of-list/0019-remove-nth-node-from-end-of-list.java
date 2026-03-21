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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==1 && head.next==null){
            return null;
        }
       int size=1;
        ListNode temp=head;
        while(temp.next!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        int si=size-n+1;
        int curpos=1;
        ListNode prevnode=null;
        while(temp!=null){
            if(curpos==si){
                break;
            }
            prevnode=temp;
            temp=temp.next;
            curpos++;
        }
        //prevnode.next=temp.next;
        if(head==temp){
            head=head.next;
            return head;
        }
        prevnode.next=temp.next;
        return head;
        
    }
}