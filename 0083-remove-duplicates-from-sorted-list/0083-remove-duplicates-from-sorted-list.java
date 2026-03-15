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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currnode=head;
        while(currnode!=null && currnode.next!=null){
            if(currnode.val==currnode.next.val){
                currnode.next=currnode.next.next;
            }else{
                currnode=currnode.next;
            }
        }
        return head;
    }
}