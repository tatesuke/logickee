package com.tatesuke.logickee.unit.basic;

import com.tatesuke.logickee.unit.Unit;
import static com.tatesuke.logickee.unit.Unit.F;
import static com.tatesuke.logickee.unit.Unit.T;

/**
 *
 * @author tatesuke
 */
public class And implements Unit {

    private Unit in1;
    private Unit in2;

    public void setIn1(Unit unit) {
        this.in1 = unit;
    }

    public void setIn2(Unit unit) {
        this.in2 = unit;
    }

    @Override
    public Unit execute() {
        Unit a = in1.execute();
        Unit b = in2.execute();

        if ((a == T) && (b == T)) {
            return T;
        } else {
            return F;
        }
    }
    
}
