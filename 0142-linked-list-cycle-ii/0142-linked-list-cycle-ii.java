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
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
               slow=head;
               while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
               }
               return slow;
            }
        }
        return null;
        // ListNode temp=head;
        // HashSet<ListNode> hs=new HashSet<>();
        // while(temp!=null){
        //    if(hs.contains(temp)){
        //      return temp;
        //    }
        //    hs.add(temp);
        //    temp=temp.next;
        // }
        // return null;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna