class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode t1=l1,t2=l2;
         ListNode dummyhead=new ListNode(-1);
         ListNode curr=dummyhead;
         int carry=0;
         while(t1!=null || t2!=null){
            int sum=carry;
            if(t1!=null) sum+=t1.val;
            if(t2!=null) sum+=t2.val;
            ListNode newnode=new ListNode(sum%10);
            carry=sum/10;
            curr.next=newnode;
            curr=newnode;
            if(t1!=null) t1=t1.next;
            if(t2!=null) t2=t2.next;

         }
         if(carry!=0){
            ListNode newnode=new ListNode(carry);
            curr.next=newnode;
         }
         return dummyhead.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna