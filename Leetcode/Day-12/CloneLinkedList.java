import java.util.HashMap;

class Node {
    int data;
    Node next, arb;

    Node(int d) 
    { 
        data = d;
        next = arb = null; 
        
    }
}

class Clone {
    //Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        HashMap<Node,Node> hm=new HashMap<>();
        
        Node node=head;
        while(node!=null){
            hm.put(node,new Node(node.data));
           node= node.next;
        }
        
        node=head;
    while(node!=null){
        hm.get(node).next=node.next!=null?hm.get(node.next):null;
        hm.get(node).arb=node.arb!=null?hm.get(node.arb):null;
        node=node.next;
    }
    
    return hm.get(head);
    }
}

