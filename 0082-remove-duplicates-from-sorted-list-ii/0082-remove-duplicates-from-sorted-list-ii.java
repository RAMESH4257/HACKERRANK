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
        // LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
        // ListNode temp=head;
        // while(temp!=null){
        //     int k=temp.val;
        //     hm.put(k,hm.getOrDefault(k,0)+1);
        //    temp=temp.next;
        // }
        // ListNode curr=new ListNode(0);
        // ListNode dummy=curr;
        // for(int i:hm.keySet()){
        //     if(hm.get(i)==1){
        //         ListNode newnode=new ListNode(i);
        //         dummy.next=newnode;
        //         dummy=newnode;
        //     }
        // }
        // return curr.next;
    // use 2 pointers time complexity is O(n) and space is O(1)
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }
        if(head.val==head.next.val && head.next.next==null){
            return null;
        }
        ListNode temp1=head;
        ListNode temp2=null;
        ListNode curr=new ListNode(0);
        ListNode dummy=curr;
        //boolean isvalid=true;
        while(temp1!=null){
            temp2=temp1.next;
            boolean isvalid=false;
            //nextnode=temp.next;
            while(temp2!=null && temp1.val==temp2.val){
                temp2=temp2.next;
                isvalid=true;
            }
            if(isvalid){
                curr.next=null;
                temp1=temp2;
                // if(temp1==temp2){
                //     break;
                // }
            }else{
                curr.next=temp1;
                curr=temp1;
               temp1=temp2;
            }
            // temp1=temp2;
            
        }
        return dummy.next;
    }
}