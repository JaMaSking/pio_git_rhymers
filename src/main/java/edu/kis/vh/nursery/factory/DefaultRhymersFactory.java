package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultcountingoutrhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.hanoiRhymer;

public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
    public defaultcountingoutrhymer GetStandardRhymer() {
        return new defaultcountingoutrhymer();
    }

    @Override
    public defaultcountingoutrhymer GetFalseRhymer() {
        return new defaultcountingoutrhymer();
    }

    @Override
    public defaultcountingoutrhymer GetFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public defaultcountingoutrhymer GetHanoiRhymer() {
        return new hanoiRhymer();
    }

}
