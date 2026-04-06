class ListNode{

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class DoubleLinkedNode{
    int val;
    DoubleLinkedNode next;
    DoubleLinkedNode prev;

    DoubleLinkedNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class CircularListNode {
    int val;
    CircularListNode next;

    CircularListNode(int val) {
        this.val = val;
        this.next = this;
    }
}

