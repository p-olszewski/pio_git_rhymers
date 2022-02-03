package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int VALUE_OF_EMPTY_LIST = -1;
    Node last;
    int i;

    private void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    private boolean isEmpty() {
        return last == null;
    }

    private boolean isFull() {
        return false;
    }

    private int top() {
        if (isEmpty())
            return VALUE_OF_EMPTY_LIST;
        return last.value;
    }

    private int pop() {
        if (isEmpty())
            return VALUE_OF_EMPTY_LIST;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
