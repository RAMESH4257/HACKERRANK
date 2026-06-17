/* Structure of a link list node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    Node divide(Node head) {
        // code here
         if(head==null || head.next==null) return head;
         Node temp=head;
        Node odd=new Node(-1);
        Node even=new Node(-1);
        Node evenp=even,oddp=odd;
        int c=0;
        Node oddhead=null;
        while(temp!=null){
            int k=temp.data;
            if(k%2==0){
                Node newnode1=new Node(k);
                evenp.next=newnode1;
                evenp=newnode1;
            }else{
                if(c==0){
                    oddhead=temp;
                }
                c++;
                Node newnode2=new Node(k);
                oddp.next=newnode2;
                oddp=newnode2;
            }
            temp=temp.next;
        }
        evenp.next=odd.next;
        return even.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna