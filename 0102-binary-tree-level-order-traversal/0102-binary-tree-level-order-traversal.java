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
    public List<List<Integer>> levelOrder(TreeNode root) {
       
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
         Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int leve_size=qu.size();
            List<Integer> li=new ArrayList<>();
            for(int i=0;i<leve_size;i++){
                TreeNode curr=qu.remove();
                int a=curr.val;
                li.add(a);
                if(curr.left!=null){
                    qu.add(curr.left);
                }
                if(curr.right!=null){
                    qu.add(curr.right);
                }
            }
            ans.add(li);
        }
        return ans;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna