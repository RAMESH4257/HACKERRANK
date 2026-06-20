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
    public ListNode getk(ListNode temp,int k){
        while((k-1)!=0 && temp!=null){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverse(ListNode temp){
        ListNode prev=null;
        while(temp!=null){
            ListNode nextnod=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextnod;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode nextnode=null,previous=null;
        while(temp!=null){
            ListNode kthNode=getk(temp,k);
            if(kthNode==null){
                if(previous!=null) previous.next=temp;
                break;
            }
            nextnode=kthNode.next;
            kthNode.next=null;
            ListNode newhead=reverse(temp);
            if(temp==head){
                head=kthNode;
            }else{
                previous.next=kthNode;
            }
            previous=temp;
            temp=nextnode;
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna