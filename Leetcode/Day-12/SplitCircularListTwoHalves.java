class circular_LinkedList {

    Node head = null;
    Node last = null;
    Node head1, head2;

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public static void printList(Node head) {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println();
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class gfg {
    // Function to split a circular LinkedList
    public void splitList(circular_LinkedList list) {
        // DO NOT REMOVE THESE 3 LINES
        Node head = list.head;
        Node head1 = null;
        Node head2 = null;

        // Modify these head1 and head2 here, head is the starting point of our original
        // linked list.
        int sz = size(list);
        Node node = head;
        head1 = node;
        for (int i = 1; i < ((sz % 2 == 0) ? (sz / 2) : (sz / 2 + 1)); i++) {
            node = node.next;
        }
        head2 = node.next;
        node.next = head;

        list.last.next = head2;

        // DO NOT REMOVE THESE 2 LINES
        list.head1 = head1;
        list.head2 = head2;
    }

    static int size(circular_LinkedList list) {
        Node node = list.head;
        int sz = 0;
        do {
            sz++;
            node = node.next;
        } while (node != list.head);
        return sz;
    }
}