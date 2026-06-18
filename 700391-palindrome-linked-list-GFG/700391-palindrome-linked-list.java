/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Stack<Integer> st=new Stack<>();
        if(head==null || head.next==null) return true;
        Node temp=head;
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.data!=st.pop()) return false;
            temp=temp.next;
        }
        return st.isEmpty();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna