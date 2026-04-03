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
    public int[] nextLargerNodes(ListNode head) {
         ListNode temp=head;
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int[] arr=new int[n];
        temp=head;
        int idx=0;
        while(temp!=null){
            arr[idx++]=temp.val;
            temp=temp.next;
        }
        int[] ans=new int[n];
        boolean isvalid=true;
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            int a=arr[i];
            while(j!=arr.length){
                if(arr[i]<arr[j]){
                    ans[i]=arr[j];
                    // j++;
                    isvalid=false;
                    break;
                }
                j++;
            }
            if(isvalid){
                ans[i]=0;
            }
        }
        return ans;
    }
}