import java.util.HashMap;
import java.util.LinkedHashMap;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Intersect {
    public int intersectPoint(Node head1, Node head2) {
        if (head1 == null || head2 == null)
            return -1;

        Node ptr1 = head1;
        Node ptr2 = head2;

        while (ptr1 != ptr2) {
            ptr1 = (ptr1 == null) ? head2 : ptr1.next;
            ptr2 = (ptr2 == null) ? head1 : ptr2.next;
        }

        return (ptr1 != null) ? ptr1.data : -1;
    }
}

class Intersect2 {
    // Function to find intersection point in Y shaped Linked Lists.
    int intersectPoint(Node head1, Node head2) {
        HashMap<Node, Integer> hm = new HashMap<>();

        Node node = head1;
        int count = 1;
        while (node != null) {
            hm.put(node, count);
            count++;
            node = node.next;
        }

        node = head2;
        while (node != null) {
            if (hm.containsKey(node)) {
                return node.data;
            } else {
                node = node.next;
            }
        }

        return -1;
    }
}

class Intersect3 {
    // Function to find intersection point in Y shaped Linked Lists.
    int intersectPoint(Node head1, Node head2) {
        if (head1 == null || head2 == null)
            return -1;

        int s1 = size(head1);
        int s2 = size(head2);

        Node ptr1 = head1;
        Node ptr2 = head2;

        int diff = Math.abs(s1 - s2);

        if (s1 > s2) {
            for (int i = 0; i < diff; i++)
                ptr1 = ptr1.next;
        } else {
            for (int i = 0; i < diff; i++)
                ptr2 = ptr2.next;
        }

        while (ptr1 != null && ptr2 != null) {
            if (ptr1 == ptr2)
                return ptr1.data;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return -1;
    }

    int size(Node node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }
}
