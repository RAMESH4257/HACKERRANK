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
    public TreeNode construct(int[] pre,int[] pos,int[] preIdx,int poStart,int poEnd,HashMap<Integer,Integer> hm){
        if(poStart>poEnd) return null;
        TreeNode root=new TreeNode(pre[preIdx[0]]);
        preIdx[0]++;
        if(poStart==poEnd){
            return root;
        }
        int posIdx=hm.get(pre[preIdx[0]]);
        root.left=construct(pre,pos,preIdx,poStart,posIdx,hm);
        root.right=construct(pre,pos,preIdx,posIdx+1,poEnd-1,hm);
        return root;
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int[] preIdx={0};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<postorder.length;i++){
            int a=postorder[i];
            hm.put(a,i);
        }
        TreeNode root=construct(preorder,postorder,preIdx,0,postorder.length-1,hm);
        return root;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna