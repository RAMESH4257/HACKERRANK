/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
     public void inorder(Node root,ArrayList<Integer> li){
        if(root==null) return;
        inorder(root.left,li);
        li.add(root.data);
        inorder(root.right,li);
    }
    public ArrayList<Integer> inOrder(Node root) {
        // code here
         ArrayList<Integer> li=new ArrayList<>();
        inorder(root,li);
        return li;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna