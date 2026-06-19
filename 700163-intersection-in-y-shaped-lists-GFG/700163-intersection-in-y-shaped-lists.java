/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        if(head1==null) return head2;
        if(head2==null) return head1;
       Set<Node> st=new HashSet<>();
       Node temp=head1;
       while(temp!=null){
           st.add(temp);
           temp=temp.next;
       }
       temp=head2;
       while(temp!=null){
           if(st.contains(temp)){
               return temp;
           }
           temp=temp.next;
       }
       return null;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna