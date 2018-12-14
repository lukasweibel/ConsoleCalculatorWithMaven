package ch.bbw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;
    private VisibilityTest visibilityTest;

    @Before
    public void setUp() {
        calculator = new Calculator();
        visibilityTest = new VisibilityTest();
    }

    //Tests class "addition"
    @Test
    public void testAdditionTwoPositiveNumbers() {
        assertTrue(calculator.addition(10, 25) == 35);
    }

    @Test
    public void testAdditionPositiveAndNegativeNumber() {
        assertTrue(calculator.addition(10, -2) == 8);
    }

    @Test
    public void testAdditionPositiveNumberAndNumberZero() {
        assertTrue(calculator.addition(10, 0) == 10);
    }

    @Test
    public void testAdditionTwoNegativeNumbers() {
        assertTrue(calculator.addition(-10, -10) == -20);
    }

    @Test
    public void testAdditionResultIsOverMax() {
        assertTrue(calculator.addition(Integer.MAX_VALUE, 3) == Integer.MIN_VALUE + 2);
    }

    @Test
    public void testAdditionResultIsUnderMax() {
        assertTrue(calculator.addition(Integer.MIN_VALUE, -25) == Integer.MAX_VALUE - 24);
    }

    @Test
    public void testAdditionMaxAndMin() {
        assertTrue(calculator.addition(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
    }

    @Test
    public void testAdditionResultIsNegative() {
        assertTrue(calculator.addition(-4, -4) == -8);
    }

    //Tests class "subtraktion"
    @Test
    public void testSubtractionTwoPositiveNumbers() {
        assertTrue(calculator.subtraction(25, 10) == 15);
    }

    @Test
    public void testSubtractionPositiveAndNegativeNumber() {
        assertTrue(calculator.subtraction(25, 10) == 15);
    }

    //Tests class "division"
    @Test
    public void testDivisionZweiPositiveIsOk() {
        assertTrue(calculator.division(50, 10) == 5);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionDurch0ThrowsExpectedException() {
        assertTrue(calculator.division(10, 0) == 0);
    }

    // @Test
    //public void testDivisionDurch0ThrowsUnexpectedException() throws ArithmeticException {
    //   assertTrue(calculator.division(10, 0) == 0);
    //}


    //Tests with different Visabilities

    @Test
    public void testPublicVisibility() {
        assertTrue(visibilityTest.returnSixPublic() == 6);
    }

    @Test
    public void testPackageProtectedVisibility() {
        assertTrue(visibilityTest.returnSixPackageProtected() == 6);
    }

    @Test
    public void testProtectedVisibility() {
        assertTrue(visibilityTest.returnSixProtected() == 6);
    }

    @Test // --> Funktioniert nicht, da die Funktion Private ist und mir somit keinen Zugriff erlaubt.
    // (Deshalb ist Assert-Befehlt ausgeklammert)
    public void testPrivateVisibility() {
        // assertTrue(visibilityTest.returnSixPrivate() == 6);
    }

}