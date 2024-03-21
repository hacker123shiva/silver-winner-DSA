import java.util.HashMap;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {

        HashMap<Node, Integer> hm = new HashMap<>();
        Node node = head;
        hm.put(head, 1);
        int count = 1;
        while (node != null) {
            node = node.next;
            if (hm.containsKey(node)) {
                return true;
            } else {
                hm.put(node, ++count);
            }

        }
        return false;
    }
}
