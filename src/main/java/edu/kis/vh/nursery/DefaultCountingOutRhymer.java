package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int ARRAY_SIZE = 12;
    public static final int INDEX_OF_EMPTY_ARRAY = -1;
    public static final int INDEX_OF_FULL_ARRAY = 11;
    private final int[] numbers = new int[ARRAY_SIZE];

    public int total = INDEX_OF_EMPTY_ARRAY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INDEX_OF_EMPTY_ARRAY;
    }

    public boolean isFull() {
        return total == INDEX_OF_FULL_ARRAY;
    }

    protected int peekaboo() {
        if (callCheck())
            return INDEX_OF_EMPTY_ARRAY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INDEX_OF_EMPTY_ARRAY;
        return numbers[total--];
    }

}
