import java.util.HashMap;

class LRUCache {

    class Node {
        int key;
        int data;
        Node next;
        Node prev;

        public Node(int key, int data) {
            this.key = key;
            this.data = data;
        }
    }

    private HashMap<Integer, Node> cache;
    private int capacity;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<Integer, Node>(capacity);
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;

    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            removeNode(node);
            addNode(node);
            return node.data;
        } else
            return -1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            removeNode(node);
            node.data = value;

            addNode(node);
        } else {
            Node node = new Node(key, value);
            if (cache.size() == capacity) {
                cache.remove(tail.prev.key);
                removeNode(tail.prev);
            }
            addNode(node);
            cache.put(key, node);

        }
    }

    public void addNode(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next = node;
        node.next.prev = node;
    }

    public void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */