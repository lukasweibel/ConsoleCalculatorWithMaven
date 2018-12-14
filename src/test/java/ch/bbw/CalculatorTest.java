package ch.bbw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSummeZweiPositiveIsOk() {
        assertTrue(calculator.summe(10, 25) == 35);
    }

    @Test
    public void testSubtractionZweiPositiveIsOk() {
        assertTrue(calculator.subtraktion(25, 10) == 15);
    }


    @Test
    public void testDivisionZweiPositiveIsOk() {
        assertTrue(calculator.division(50, 10) == 5);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionDurch0ThrowsExpectedException() {
        assertTrue(calculator.division(10, 0) == 0);
    }

    @Test
    public void testDivisionDurch0ThrowsUnexpectedException()  throws ArithmeticException {
        assertTrue(calculator.division(10, 0) == 0);
    }

}