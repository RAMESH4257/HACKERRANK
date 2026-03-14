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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode newnode=new ListNode();
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode ans=newnode;
        if(temp1==null && temp2!=null){
            return temp2;
        }
        if(temp2==null && temp1!=null){
            return temp1;
        }
        if(temp1==null && temp2==null){
            return temp1;
        }
        if(temp1.next==null && temp2.next==null){
            if(temp1.val<temp2.val){
                newnode.next=temp1;
                newnode=newnode.next;
                newnode.next=temp2;
            }else{
                newnode.next=temp2;
                newnode=newnode.next;
                newnode.next=temp1;
            }
            return ans.next;
        }
        while(temp1!=null &&  temp2!=null){
        if(temp1.val<temp2.val){
            newnode.next=temp1;
            //newnode.next=temp1;
            temp1=temp1.next;

            // newnode.val=temp2.val;
            // newnode.next=temp1;
            // temp1=temp1.next;

            //newnode.next=null;
        }else if(temp1.val==temp2.val){
            newnode.next=temp1;
            temp1=temp1.next;
            newnode=newnode.next;
            newnode.next=temp2;
            temp2=temp2.next;
        }
        else{
            newnode.next=temp2;
            //newnode.next=temp2;
            temp2=temp2.next;
        }
         newnode=newnode.next;
        }
        if (temp1 != null) {
          newnode.next = temp1;
        } else {
          newnode.next = temp2;
        }
        return ans.next;
    }
}