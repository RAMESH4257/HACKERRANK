/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // code here
        if(head==null || head.next==null) return -1;
        Set<Node> hs=new HashSet<>();
        Node temp=head;
        while(temp!=null){
            if(hs.contains(temp)) return temp.data;
            hs.add(temp);
            temp=temp.next;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna