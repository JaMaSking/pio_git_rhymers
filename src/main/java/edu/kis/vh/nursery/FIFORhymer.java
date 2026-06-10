package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callcheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callcheck())
            countIn(temp.countOut());

        return ret;
    }
}