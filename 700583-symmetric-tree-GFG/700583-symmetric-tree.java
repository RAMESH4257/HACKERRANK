/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean check(Node n1,Node n2){
        if(n1==null && n2==null) return true;
        if(n1==null||n2==null) return false;
        if(n1.data!=n2.data) return false;
        return check(n1.left,n2.right)&&check(n1.right,n2.left);
    }
    public boolean isSymmetric(Node root) {
        if(root==null){
            return false;
        }
        return check(root.left,root.right);
        //  if(root==null){
        //     return false;copy
        // }
        // Queue<Node> q=new LinkedList<>();
        // q.add(root.left);
        // q.add(root.right);
        // while(!q.isEmpty()){
        //     Node n1=q.remove();
        //     Node n2=q.remove();
        //     if(n1==null && n2==null) continue;
        //     if(n1==null || n2==null) return false;
        //     if(n1.data!=n2.data) return false;
        //     q.add(n1.left);
        //     q.add(n2.right);
        //     q.add(n1.right);
        //     q.add(n2.left);
        // }
        // return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna