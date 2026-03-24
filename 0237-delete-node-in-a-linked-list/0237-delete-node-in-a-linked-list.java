/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // In node value we copy the next node value and then delete it
         ListNode newnode=node.next;
        node.val=newnode.val;
        node.next=node.next.next;
    }
}