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
public class NotTest {
    
    @Test
    public void test_setter_F() {
        Not not = new Not();
        not.setIn(F);
        Unit result = not.execute();
        assertThat(result, is(T));
    }
    
    @Test
    public void test_setter_T() {
       Not not = new Not();
        not.setIn(T);
        Unit result = not.execute();
        assertThat(result, is(F));
    }
    
    
}
