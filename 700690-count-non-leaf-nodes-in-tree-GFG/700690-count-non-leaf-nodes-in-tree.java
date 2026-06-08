/*class Node
{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/

// function should return the count of total number of non leaf nodes in the tree.
class Solution {
   
    int countNonLeafNodes(Node root) {
        Queue<Node> qu=new LinkedList<>();
        qu.add(root);
        int c=0;
        while(!qu.isEmpty()){
            Node curr=qu.remove();
            if(curr.left!=null || curr.right!=null){
                c++;
            }
            if(curr.left!=null){
                
                qu.add(curr.left);
            }
            if(curr.right!=null){
                qu.add(curr.right);
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna