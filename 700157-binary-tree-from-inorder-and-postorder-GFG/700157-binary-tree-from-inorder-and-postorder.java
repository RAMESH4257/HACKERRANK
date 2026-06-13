/*
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
      public Node construct(int[] ino,int[] pos,int[] posidx,int inStart,int inEnd, Map<Integer, Integer> map){
        if(inStart>inEnd) return null;
        Node root=new Node(pos[posidx[0]]);
        int idx=map.get(pos[posidx[0]]);
        posidx[0]--;
        root.right=construct(ino,pos,posidx,idx+1,inEnd,map);
        root.left=construct(ino,pos,posidx,inStart,idx-1,map);
        return root;
    }
    Node buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }
        int[] posidx={postorder.length-1};
        Node root=construct(inorder,postorder,posidx,0,postorder.length-1,map);
        return root;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna