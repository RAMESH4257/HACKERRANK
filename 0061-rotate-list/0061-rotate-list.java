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
    static int[] reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        ListNode temp=head;
        int c=0;
        while(temp!=null){
          c++;
          temp=temp.next;
        }
        int[] ans=new int[c];
        temp=head;
        int i=0;
        while(temp!=null){
            ans[i++]=temp.val;
            temp=temp.next;
        }
        int n=c;
        k=k%n;
        ans=reverse(ans,0,n-1);
        ans=reverse(ans,0,k-1);
        ans=reverse(ans,k,n-1);
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int j=0;j<ans.length;j++){
            ListNode newnode=new ListNode(ans[j]);
            curr.next=newnode;
            curr=curr.next;
        }
        return dummy.next;
    }
}