/*
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
     public Node construct(int[] pre,int[] pos,int[] preIdx,int poStart,int poEnd,HashMap<Integer,Integer> hm){
        if(poStart>poEnd) return null;
        Node root=new Node(pre[preIdx[0]]);
        preIdx[0]++;
        if(poStart==poEnd){
            return root;
        }
        int posIdx=hm.get(pre[preIdx[0]]);
        root.left=construct(pre,pos,preIdx,poStart,posIdx,hm);
        root.right=construct(pre,pos,preIdx,posIdx+1,poEnd-1,hm);
        return root;
    }
    public Node constructTree(int[] pre, int[] post) {
        // code here
        int[] preIdx={0};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<post.length;i++){
            int a=post[i];
            hm.put(a,i);
        }
        Node root=construct(pre,post,preIdx,0,post.length-1,hm);
        return root;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna