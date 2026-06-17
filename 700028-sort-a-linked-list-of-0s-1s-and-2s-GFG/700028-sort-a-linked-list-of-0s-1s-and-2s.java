/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        if(head==null || head.next==null) return head;
        Node zerohead=new Node(-1);
        Node onehead=new Node(-1);
        Node twohead=new Node(-1);
        Node zero=zerohead,one=onehead,two=twohead,temp=head;

        while(temp!=null){
            int k=temp.data;
            if(k==0){
                zero.next=temp;
                zero=temp;
            }else if(k==1){
                one.next=temp;
                one=temp;
            }else{
                two.next=temp;
                two=temp;
            }
            temp=temp.next;
        }
        zero.next=(onehead.next!=null)?onehead.next:twohead.next;
        one.next=twohead.next;
        two.next=null;
        return zerohead.next;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna