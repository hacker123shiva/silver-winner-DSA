
 

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

 

class Solution
{
    public static Node reverse(Node node, int k)
    {
        
        Node prev=null;
        Node head=node;
        Node current=head;
        Node next=null;
        
        int count=0;
        while(count<k&&current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            count++;
        }
        
        if(next!=null){
            head.next=reverse(next,k);
        }
        
        return prev;
        
        
        
    }
    
 
}

