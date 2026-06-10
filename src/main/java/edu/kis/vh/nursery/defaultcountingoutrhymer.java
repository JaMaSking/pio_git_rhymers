package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;

    public static final int EMPTY_INDEX = -1;

    public static final int RETURN_VALUE = -1;

    private int[] numbers = new int[CAPACITY];

    private int total = EMPTY_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callcheck() {
        return total == EMPTY_INDEX;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callcheck())
            return RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callcheck())
            return RETURN_VALUE;
        return numbers[total--];
    }
}