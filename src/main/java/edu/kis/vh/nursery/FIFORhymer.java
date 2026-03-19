package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer temp = new defaultCountingOutRhymer();

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
