package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }

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