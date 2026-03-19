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
    static int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode temp=head;
        //ListNode dummy=new ListNode(0);
        ListNode curr=temp;
        while(temp.next!=null){
            ListNode nextnode=temp.next;
            int a=gcd(temp.val,temp.next.val);
            ListNode newnode=new ListNode(a);
            temp.next=newnode;
            newnode.next=nextnode;
            //curr.next=newnode;
            //curr=curr.next;
            temp=nextnode;
        }
        return curr;
    }
}