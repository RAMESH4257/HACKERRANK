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
    public TreeNode construct(int[] pre,int[] ino,int[] preidx,int inStart,int inEnd, Map<Integer, Integer> map){
        if(inStart>inEnd) return null;
        TreeNode root=new TreeNode(pre[preidx[0]]);
        int idx=map.get(pre[preidx[0]]);
        preidx[0]++;
        root.left=construct(pre,ino,preidx,inStart,idx-1,map);
        root.right=construct(pre,ino,preidx,idx+1,inEnd,map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }
        int[] preidx={0};
        TreeNode root=construct(preorder,inorder,preidx,0,preorder.length-1,map);
        return root;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna