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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode odd=head,even=head.next,evenhead=even;
        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
        //  if(head==null || head.next==null || head.next.next==null) return head;
        // List<Integer> ans=new ArrayList<>();
        // ListNode temp=head;
        // while(temp!=null && temp.next!=null){
        //     ans.add(temp.val);
        //     temp=temp.next.next;
        // }
        // if(temp!=null) ans.add(temp.val);
        // temp=head.next;
        // while(temp!=null && temp.next!=null){
        //     ans.add(temp.val);
        //     temp=temp.next.next;
        // }
        // if(temp!=null) ans.add(temp.val);
        // temp=head;
        // int i=0;
        // while(temp!=null){
        //     temp.val=ans.get(i);
        //     i++;
        //     temp=temp.next;
        // }
        // return head;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna