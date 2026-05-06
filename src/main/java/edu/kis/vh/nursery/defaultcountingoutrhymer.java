package edu.kis.vh.nursery;
/**
 * Klasa DefaultCountingOutRhymer reprezentuje podstawowy mechanizm wyliczanki
 */
///

public class defaultcountingoutrhymer {

    public static final int CAPACITY = 12;
    public static final int EMPTY = -1;

    private int[] NUMBERS = new int[CAPACITY];

    public int total = EMPTY;

    /**
     * Dodaje nową wartość do wyliczanki, o ile nie osiągnięto maksymalnej pojemności.
     * * @param in Wartość liczbowa do dodania.
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callcheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callcheck())
            return EMPTY;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callcheck())
            return EMPTY;
        return NUMBERS[total--];
    }

}
