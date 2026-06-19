/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public boolean detectLoop(Node head) {
        // code here
        if(head==null || head.next==null) return false;
        Node temp=head;
        HashSet<Node> hs=new HashSet<>();
        while(temp!=null){
            if(hs.contains(temp)) return true;
            hs.add(temp);
            temp=temp.next;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna