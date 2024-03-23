class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

}

class Solution {
    public ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // Split the list into two halves
        ListNode middle = findMiddle(head);
        ListNode nextToMiddle = middle.next;
        middle.next = null;

        // Recursively sort both halves
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(nextToMiddle);

        // Merge the sorted halves
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode result = null;

        // Base cases
        if (left == null)
            return right;
        if (right == null)
            return left;

        // Choose the smaller value and recursively merge the rest
        if (left.val <= right.val) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }

    private ListNode findMiddle(ListNode head) {
        if (head == null)
            return head;

        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
