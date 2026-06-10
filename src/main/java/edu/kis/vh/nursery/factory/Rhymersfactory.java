package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public interface RhymersFactory {
    DefaultCountingOutRhymer getStandardRhymer();
    DefaultCountingOutRhymer getFalseRhymer();
    FIFORhymer getFIFORhymer();
    HanoiRhymer getHanoiRhymer();
}