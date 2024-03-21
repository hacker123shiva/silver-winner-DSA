
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    int getMiddle(Node head) {
        Node node = head;
        int siz = size(node);
        int mid = (siz % 2 == 0 ? siz / 2 : siz / 2 + 1);
        for (int i = 1; i < mid; i++) {
            node = node.next;
        }
        if (size(head) % 2 == 0) {
            return node.next.data;
        } else {
            return node.data;
        }
    }

    int size(Node node) {
        int count = 0;
        while (node != null) {
            node = node.next;
            count++;
        }
        return count;
    }

}

/*
 * fast and slow pointer concept
 */

class Solution2 {
    int getMiddle(Node head) {
        if (head == null || head.next == null) {
            return head.data; // If list is empty or has only one node, return head
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer one step
            fast = fast.next.next; // Move fast pointer two steps
        }

        return slow.data; // Slow pointer is now at the middle of the list
    }

}