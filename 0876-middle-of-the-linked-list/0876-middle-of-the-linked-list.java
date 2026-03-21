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
    public ListNode middleNode(ListNode head) {
        //  ListNode temp=head;
        // int c=0;
        // while(temp!=null){
        //     c++;
        //     temp=temp.next;
        // }

        // int k=0;
        // if(c%2==1){
        //     k=c/2;
        //     k+=1;
        // }else{
        //     k=c/2;
        //     k+=1;
        // }
        // ListNode curnode=null;
        // ListNode tempp=head;
        // int curpos=1;
        // while(tempp!=null){
        //     if(curpos==k){
        //         curnode=tempp;
        //         break;
        //     }
        //     curpos++;
        //     tempp=tempp.next;
        // }
        // return curnode; 
     // TWO-POINTERS
    ListNode slow=head;
    ListNode fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;


    }
}