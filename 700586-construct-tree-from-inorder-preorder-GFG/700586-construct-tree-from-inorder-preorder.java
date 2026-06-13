/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public static Node construct(int[] ino,int[] pre,int[] preidx,int inStart,int inEnd, Map<Integer, Integer> map){
        if(inStart>inEnd) return null;
        Node root=new Node(pre[preidx[0]]);
        int idx=map.get(pre[preidx[0]]);
        preidx[0]++;
        root.left=construct(ino,pre,preidx,inStart,idx-1,map);
        root.right=construct(ino,pre,preidx,idx+1,inEnd,map);
        return root;
    }
    public static Node buildTree(int inorder[], int preorder[]) {
         Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }
        int[] preidx={0};
        Node root=construct(inorder,preorder,preidx,0,preorder.length-1,map);
        return root;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna