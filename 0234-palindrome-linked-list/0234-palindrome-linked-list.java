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
    // reverse the second half
       static ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode prevnode=null,nextnode;
        while(temp!=null){
            nextnode=temp.next;
            temp.next=prevnode;
            prevnode=temp;
            temp=nextnode;
        }
        head=prevnode;
        return head;
    }
    public boolean isPalindrome(ListNode head) {
        // find the middle
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode firsthalf=head;
        ListNode secondhalf=reverse(slow);
        // compare the secondhalf
        while(secondhalf!=null){
            if(firsthalf.val!=secondhalf.val){
                return false;
            }
            firsthalf=firsthalf.next;
            secondhalf=secondhalf.next;
        }
        return true;
    }
}