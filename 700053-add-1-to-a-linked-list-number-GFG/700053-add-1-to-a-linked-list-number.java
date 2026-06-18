/* Structure of linked list Node
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
    public Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node prev=null,temp=head;
        while(temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public Node addOne(Node head) {
        if(head==null) return null;
        head=reverse(head);
        Node temp=head;
        int carry=1;
        while(temp!=null){
            int sum=temp.data+carry;
            if(sum<10){
                temp.data=sum;
                break;
            }else{
                temp.data=(sum%10);
                carry=1;
            }
            temp=temp.next;
        }
        if(carry==1 && temp==null){
            Node newnode=new Node(1);
            head=reverse(head);
            newnode.next=head;
            return newnode;
        }
        head=reverse(head);
        return head;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna