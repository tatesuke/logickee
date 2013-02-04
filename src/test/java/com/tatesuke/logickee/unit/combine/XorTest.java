package com.tatesuke.logickee.unit.combine;

import com.tatesuke.logickee.unit.Unit;
import com.tatesuke.logickee.unit.basic.Or;
import static com.tatesuke.logickee.unit.Unit.F;
import static com.tatesuke.logickee.unit.Unit.T;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author tatesuke
 */
public class XorTest {

    @Test
    public void testF_F() {
        Xor xor = new Xor();
        xor.setIn1(F);
        xor.setIn2(F);
        Unit result = xor.execute();
        assertThat(result, is(F));
    }

    @Test
    public void testF_T() {
        Xor xor = new Xor();
        xor.setIn1(F);
        xor.setIn2(T);
        Unit result = xor.execute();
        assertThat(result, is(T));
    }

    @Test
    public void testT_F() {
        Xor xor = new Xor();
        xor.setIn1(T);
        xor.setIn2(F);
        Unit result = xor.execute();
        assertThat(result, is(T));
    }

    @Test
    public void testT_T() {
        Xor xor = new Xor();
        xor.setIn1(T);
        xor.setIn2(T);
        Unit result = xor.execute();
        assertThat(result, is(F));
    }
}
