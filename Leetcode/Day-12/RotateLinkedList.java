
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public Node rotate(Node head, int k) {

        Node curr = head;
        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }

        if (curr.next != null) {
            Node node = curr.next;
            Node newHead = curr.next;

            while (node.next != null) {
                node = node.next;
            }

            node.next = head;
            curr.next = null;
            return newHead;

        } else {
            return head;
        }

    }
}