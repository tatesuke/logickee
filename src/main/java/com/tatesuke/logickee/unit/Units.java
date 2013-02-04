package com.tatesuke.logickee.unit;

import com.tatesuke.logickee.unit.basic.And;
import com.tatesuke.logickee.unit.basic.Not;
import com.tatesuke.logickee.unit.basic.Or;

/**
 *
 * @author tatesuke
 */
public class Units {
    
    public static Unit and(Unit in1, Unit in2) {
        And and = new And();
        and.setIn1(in1);
        and.setIn2(in2);
        return and;
    }
    
    public static Unit or (Unit in1, Unit in2) {
        Or or = new Or();
        or.setIn1(in1);
        or.setIn2(in2);
        return or;
    }
    
    public static Unit not (Unit in) {
        Not not = new Not();
        not.setIn(in);
        return not;
    }
    
}
