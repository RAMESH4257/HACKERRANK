/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/
class Solution {
    public static Node getKthNode(Node head,int k){
        Node temp=head;
        while((k-1)!=0 && temp!=null){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public static Node reverse(Node temp)
    {
        if(temp==null || temp.next==null) return temp;
        Node prev=null;
        while(temp!=null){
            Node nextnode=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextnode;
        }
        return prev;
    }
    public Node reverseKGroup(Node head, int k) {
        // code here
         Node temp=head;
       Node previous=null,nextnode=null;
       while(temp!=null){
        Node kthNode=getKthNode(temp,k);
        if(kthNode==null){
              Node newHead = reverse(temp);

                if(previous != null)
                    previous.next = newHead;
                else
                    head = newHead;
            
                break;
        }

        nextnode=kthNode.next;
        kthNode.next=null;
        Node newhead=reverse(temp);
        if(head==temp){
            head=kthNode;

        }else{
            previous.next=kthNode;
        }
        previous=temp;
        temp=nextnode;
     
      }
      return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna