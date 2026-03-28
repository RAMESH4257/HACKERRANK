/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if( head==null || head.next==null){
            return null;
        }
        ListNode temp=head;
        HashSet<ListNode> hs=new HashSet<>();
        while(temp!=null){
           if(hs.contains(temp)){
             return temp;
           }
           hs.add(temp);
           temp=temp.next;
        }
        return null;
    }
}