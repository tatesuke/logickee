package com.tatesuke.logickee.unit.basic;

import com.tatesuke.logickee.unit.Unit;
import static com.tatesuke.logickee.unit.Unit.F;
import static com.tatesuke.logickee.unit.Unit.T;

/**
 *
 * @author tatesuke
 */
public class Not implements Unit {

    private Unit in;

    public void setIn(Unit unit) {
        this.in = unit;
    }

    @Override
    public Unit execute() {
        Unit a = in.execute();

        if (a == T) {
            return F;
        } else {
            return T;
        }
    }
    
}
