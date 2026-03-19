package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultcountingoutrhymer;

public interface Rhymersfactory {

    public defaultcountingoutrhymer GetStandardRhymer();

    public defaultcountingoutrhymer GetFalseRhymer();

    public defaultcountingoutrhymer GetFIFORhymer();

    public defaultcountingoutrhymer GetHanoiRhymer();

}
