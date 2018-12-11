package ch.bbw;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator testee;

    @Test
    public void testSummeZweiPositiveIsOk() {
        testee = new Calculator();
        assertTrue(testee.summe(10, 25) == 35);
    }

}