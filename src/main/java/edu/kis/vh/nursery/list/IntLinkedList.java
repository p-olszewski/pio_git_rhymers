package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int VALUE_OF_EMPTY_LIST = -1;
    private Node last;
    private int i;

    private void push(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }

    private boolean isEmpty() {
        return getLast() == null;
    }

    private boolean isFull() {
        return false;
    }

    private int top() {
        if (isEmpty())
            return VALUE_OF_EMPTY_LIST;
        return getLast().getValue();
    }

    private int pop() {
        if (isEmpty())
            return VALUE_OF_EMPTY_LIST;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
