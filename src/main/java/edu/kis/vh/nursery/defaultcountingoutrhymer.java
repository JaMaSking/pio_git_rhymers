package edu.kis.vh.nursery;

public class defaultcountingoutrhymer {

    private int[] NUMBERS = new int[12];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callcheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callcheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callcheck())
            return -1;
        return NUMBERS[total--];
    }

}
