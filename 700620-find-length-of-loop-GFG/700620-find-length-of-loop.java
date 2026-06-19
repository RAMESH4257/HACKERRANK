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
    public static int len(Node slow,Node fast){
        fast=fast.next;
        int c=1;
        while(slow!=fast){
            c++;
            fast=fast.next;
        }
        return c;
    }
    public int lengthOfLoop(Node head) {
        // code here
        if(head==null || head.next==null) return 0;
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return len(slow,fast);
            }
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna