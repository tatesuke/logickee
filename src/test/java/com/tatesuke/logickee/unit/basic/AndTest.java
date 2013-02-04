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
public class AndTest {
    
    @Test
    public void test_setter_F_F() {
        And and = new And();
        and.setIn1(F);
        and.setIn2(F);
        Unit result = and.execute();
        assertThat(result, is(F));
    }
    
    @Test
    public void test_setter_F_T() {
        And and = new And();
        and.setIn1(F);
        and.setIn2(T);
        Unit result = and.execute();
        assertThat(result, is(F));
    }
    
    @Test
    public void test_setter_T_F() {
        And and = new And();
        and.setIn1(T);
        and.setIn2(F);
        Unit result = and.execute();
        assertThat(result, is(F));
    }
    
    @Test
    public void test_setter_T_T() {
        And and = new And();
        and.setIn1(T);
        and.setIn2(T);
        Unit result = and.execute();
        assertThat(result, is(T));
    }
    
}
