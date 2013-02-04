package com.tatesuke.logickee.unit.combine;

import com.tatesuke.logickee.unit.Unit;
import static com.tatesuke.logickee.unit.Units.*;

/**
 *
 * @author tatesuke
 */
public class Xor {

    private Unit in1;
    private Unit in2;

    public void setIn1(Unit unit) {
        this.in1 = unit;
    }

    public void setIn2(Unit unit) {
        this.in2 = unit;
    }

    Unit execute() {
        return or(and(in1, not(in2)), and(not(in1), in2)).execute();       
    }
    
}
