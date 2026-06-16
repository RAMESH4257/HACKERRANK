/*
Definition for Node
class Node {
    int data;
    Node left, right;
    Node(int d)
    {
        data  =d;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
         ArrayList<Integer> ans=new ArrayList<>();
        //ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        int level=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levSize=q.size();
            ArrayList<Integer> li=new ArrayList<>();
            for(int i=0;i<levSize;i++){
                Node curr=q.remove();
                if(level%2==0){
                    li.add(curr.data);
                }else{
                    li.add(0,curr.data);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            level++;
            ans.addAll(li);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna