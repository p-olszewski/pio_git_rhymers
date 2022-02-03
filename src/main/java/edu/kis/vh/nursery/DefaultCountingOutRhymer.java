package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ARRAY_SIZE = 12;
    private static final int INDEX_OF_EMPTY_ARRAY = -1;
    private static final int INDEX_OF_FULL_ARRAY = 11;
    private final int[] numbers = new int[ARRAY_SIZE];

    public int getTotal() {
        return total;
    }

    private int total = INDEX_OF_EMPTY_ARRAY;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == INDEX_OF_EMPTY_ARRAY;
    }

    protected boolean isFull() {
        return total == INDEX_OF_FULL_ARRAY;
    }

    protected int peekaboo() {
        if (callCheck())
            return INDEX_OF_EMPTY_ARRAY;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return INDEX_OF_EMPTY_ARRAY;
        return numbers[total--];
    }

}
