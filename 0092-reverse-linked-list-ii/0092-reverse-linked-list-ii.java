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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       if(left==1 && right==1){
            return head;
        }
       int curpos=1;
        ListNode prevnode=null;
        ListNode temp=head;
        // find out the first position where i start my reverse
        while(temp!=null){
            if(curpos==left){
                break;
            }
            curpos++;
            prevnode=temp;
            temp=temp.next;
        }
        //prevnode.next=null;
        ListNode start=temp;
        temp=head;
        ListNode prevnode2=null;
        curpos=1;
        // find out the end node of reverse list
        while(temp!=null){
            if(curpos==right){
                break;
            }
            curpos++;
            prevnode2=temp;
            temp=temp.next;
        } 
        ListNode end=temp.next;
        temp.next=null;


        //prevnode2=temp;
        ListNode tempp=start;
        ListNode previous=null;
        ListNode nextnode;
        //  reverse the first to end node
        while(tempp!=null){
              nextnode=tempp.next;
              tempp.next=previous;
              previous=tempp;
              tempp=nextnode;
        }
        // while check the condition because left==1 or not and then we line them
        if(prevnode!=null){
            prevnode.next=previous;
        }else{
            head=previous;
        }
        start.next=end;
        return head;
    }
}