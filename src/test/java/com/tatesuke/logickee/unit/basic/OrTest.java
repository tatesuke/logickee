/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tatesuke.logickee.unit.basic;

import com.tatesuke.logickee.unit.Unit;
import static com.tatesuke.logickee.unit.Unit.F;
import static com.tatesuke.logickee.unit.Unit.T;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author tatesuke
 */
public class OrTest {
    
    @Test
    public void test_setter_F_F() {
        Or or = new Or();
        or.setIn1(F);
        or.setIn2(F);
        Unit result =or.execute();
        assertThat(result, is(F));
    }
    
    @Test
    public void test_setter_F_T() {
        Or or = new Or();
        or.setIn1(F);
        or.setIn2(T);
        Unit result = or.execute();
        assertThat(result, is(T));
    }
    
    @Test
    public void test_setter_T_F() {
        Or or = new Or();
        or.setIn1(T);
        or.setIn2(F);
        Unit result = or.execute();
        assertThat(result, is(T));
    }
    
    @Test
    public void test_setter_T_T() {
        Or or = new Or();
        or.setIn1(T);
        or.setIn2(T);
        Unit result = or.execute();
        assertThat(result, is(T));
    }
    
    
}
