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
         if(head==null || head.next==null || head.next.next==null) return head;
        List<Integer> ans=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            ans.add(temp.val);
            temp=temp.next.next;
        }
        if(temp!=null) ans.add(temp.val);
        temp=head.next;
        while(temp!=null && temp.next!=null){
            ans.add(temp.val);
            temp=temp.next.next;
        }
        if(temp!=null) ans.add(temp.val);
        temp=head;
        int i=0;
        while(temp!=null){
            temp.val=ans.get(i);
            i++;
            temp=temp.next;
        }
        return head;
        // if(head==null || head.next==null || head.next.next==null){
        //     return head;
        // }
        // ListNode temp1=head;
        // ListNode link1=head;
        // ListNode temp2=head.next;
        // ListNode ref=temp2;
        // ListNode link2=head.next;
        // while(temp1!=null && temp2!=null){
        //     temp1=temp1.next.next;
        //     link1.next=temp1;
        //     if(temp1==null){
        //         break;
        //     }
        //     link1=temp1;
            
        //     temp2=temp2.next.next;
        //     link2.next=temp2;
        //     link2=temp2;
        // }
        // link1.next=ref;
        // return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna