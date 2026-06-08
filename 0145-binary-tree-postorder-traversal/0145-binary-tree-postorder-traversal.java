/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    void postorder(List<Integer> li,TreeNode root){
        if(root==null) return;
        postorder(li,root.left);
        postorder(li,root.right);
        li.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        postorder(li,root);
        return li;
        // List<Integer> li=new ArrayList<>();
        // Stack<TreeNode> st=new Stack<>();
        // TreeNode lastVisitedNode=null;
        // while(root!=null || !st.isEmpty()){
        //     while(root!=null){
        //         st.push(root);
        //         root=root.left;
        //     }
        //     TreeNode curr=st.peek();
        //     if(curr.right!=null && curr.right!=lastVisitedNode){
        //         root=curr.right;
        //     }
        //     else{
        //         li.add(curr.val);
        //         lastVisitedNode=st.pop();
        //     }
        // }
        // return li;
       
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna