/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node find(Node temp,int lim){
        int c=1;
        while(temp!=null){
            if(c==lim){
                break;
            }
            c++;
            temp=temp.next;
        }
        return temp;
    }
    public Node rotate(Node head, int k) {
        // code here
        if(head == null || head.next == null || k == 0) return head;
        Node tail=head;
        int len=1;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        if(k%len==0) return head;
        k=k%len;
        tail.next=head;
        Node newLastNode=find(head,k);
        head=newLastNode.next;
        newLastNode.next=null;
        return head;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna