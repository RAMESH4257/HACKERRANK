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
     public TreeNode construct(int[] ino,int[] pos,int[] posidx,int inStart,int inEnd, Map<Integer, Integer> map){
        if(inStart>inEnd) return null;
        TreeNode root=new TreeNode(pos[posidx[0]]);
        int idx=map.get(pos[posidx[0]]);
        posidx[0]--;
        root.right=construct(ino,pos,posidx,idx+1,inEnd,map);
        root.left=construct(ino,pos,posidx,inStart,idx-1,map);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }
        int[] posidx={postorder.length-1};
        TreeNode root=construct(inorder,postorder,posidx,0,postorder.length-1,map);
        return root;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna