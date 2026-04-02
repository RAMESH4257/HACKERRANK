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
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
        ListNode temp=head;
        while(temp!=null){
            int k=temp.val;
            hm.put(k,hm.getOrDefault(k,0)+1);
           temp=temp.next;
        }
        ListNode curr=new ListNode(0);
        ListNode dummy=curr;
        for(int i:hm.keySet()){
            if(hm.get(i)==1){
                ListNode newnode=new ListNode(i);
                dummy.next=newnode;
                dummy=newnode;
            }
        }
        return curr.next;
    }
}