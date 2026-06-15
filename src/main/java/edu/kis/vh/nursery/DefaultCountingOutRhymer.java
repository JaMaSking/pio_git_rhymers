package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int EMPTY_INDEX = -1;
    public static final int RETURN_VALUE = -1;

    public static final int MAX_INDEX = CAPACITY - 1;

    private int[] numbers = new int[CAPACITY];

    private int total = EMPTY_INDEX;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callcheck() {
        return total == EMPTY_INDEX;
    }

    public boolean isFull() {
        return total == MAX_INDEX;
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