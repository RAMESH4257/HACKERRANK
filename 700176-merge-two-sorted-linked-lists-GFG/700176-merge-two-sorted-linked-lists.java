/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node convertll(ArrayList<Integer> li){
        Node dummy=new Node(-1);
        Node curr=dummy;
        for(int i=0;i<li.size();i++){
            Node n1=new Node(li.get(i));
            curr.next=n1;
            curr=n1;
        }
        return dummy.next;
    }
    Node sortedMerge(Node head1, Node head2) {
        // code here
        if(head1==null) return head2;
        if(head2==null) return head1;
        Node t1=head1,t2=head2;
        ArrayList<Integer> li=new ArrayList<>();
        while(t1!=null){
            li.add(t1.data);
            t1=t1.next;
        }
        while(t2!=null){
            li.add(t2.data);
            t2=t2.next;
        }
        Collections.sort(li);
        return convertll(li);
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna