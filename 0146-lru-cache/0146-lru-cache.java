class Node{
    public int key,val;
    public Node next,prev;
    Node(){
        key=val=-1;
        next=prev=null;
    }
    Node(int k,int v){
       key=k;
       val=v;
       next=null;
       prev=null;
    }
}
class LRUCache {
    int cap;
    Map<Integer,Node> hm;
    Node head,tail;
    void deleteNode(Node temp){
        Node front=temp.next;
        Node back=temp.prev;
        back.next=front;
        front.prev=back;
    }
    void insertAfterHead(Node temp){
        Node nextnode=head.next;
        head.next=temp;
        temp.next=nextnode;
        temp.prev=head;
        nextnode.prev=temp;

    }
    public LRUCache(int capacity) {
        cap=capacity;
        hm=new HashMap<>();
        head=new Node();
        tail=new Node();
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!hm.containsKey(key))
            return -1;
        Node node=hm.get(key);
        int ans=node.val;
        deleteNode(node);
        insertAfterHead(node);
        return ans;
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            Node n=hm.get(key);
            n.val=value;
            deleteNode(n);
            insertAfterHead(n);
            return;
        }
        if(hm.size()==cap){
            Node n=tail.prev;
            hm.remove(n.key);
            deleteNode(n);
            Node newnode=new Node(key,value);
            hm.put(key,newnode);
            insertAfterHead(newnode);
            return;

        }
         Node newnode=new Node(key,value);
        hm.put(key,newnode);
        insertAfterHead(newnode);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna