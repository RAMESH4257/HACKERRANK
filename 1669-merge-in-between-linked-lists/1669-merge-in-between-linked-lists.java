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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int currnode=1;
        ListNode temp1=list1;
        while(currnode<a){
            temp1=temp1.next;
            currnode++;
        }
        ListNode temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        // temp1.next=list2;
        currnode=1;

        ListNode temp2=list1;
        while(currnode<b+1){
            temp2=temp2.next;
            currnode++;
        }
         temp1.next=list2;
        temp.next=temp2.next;
        //temp1.next=temp2;
        return list1;
    }
}