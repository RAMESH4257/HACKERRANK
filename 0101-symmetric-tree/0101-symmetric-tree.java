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
    // public boolean check(TreeNode root1,TreeNode root2){
    //     if(root1==null && root2==null){
    //         return true;
    //     }
    //     if(root1==null||root2==null){
    //         return false;
    //     }
    //     if(root1.val!=root2.val) return false;
    //     return check(root1.left,root2.right)&&check(root1.right,root2.left);
    // }
    public boolean isSymmetric(TreeNode root) {
        // if(root==null) return false;
        // return check(root.left,root.right);
        // iterative approach(level-order)
        if(root==null){
            return false;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root.left);
        q.add(root.right);
        while(!q.isEmpty()){
            TreeNode n1=q.remove();
            TreeNode n2=q.remove();
            if(n1==null && n2==null) continue;
            if(n1==null || n2==null) return false;
            if(n1.val!=n2.val) return false;
            q.add(n1.left);
            q.add(n2.right);
            q.add(n1.right);
            q.add(n2.left);
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna