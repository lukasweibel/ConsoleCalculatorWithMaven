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
    public void testAdditionResultIsUnderMin() {
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
        assertTrue(calculator.subtraction(25, -10) == 35);
    }

    @Test
    public void testSubtractionPositiveNumberAndNumberZero() {
        assertTrue(calculator.subtraction(10, 0) == 10);
    }

    @Test
    public void testSubtractionTwoNegativeNumbers() {
        assertTrue(calculator.subtraction(-10, -10) == 0);
    }

    @Test
    public void testSubtractionResultIsOverMax() {
        assertTrue(calculator.subtraction(Integer.MAX_VALUE, -3) == Integer.MIN_VALUE + 2);
    }

    @Test
    public void testSubtractionResultIsUnderMin() {
        assertTrue(calculator.subtraction(Integer.MIN_VALUE, 25) == Integer.MAX_VALUE - 24);
    }

    @Test
    public void testSubtractionMaxAndMin() {
        assertTrue(calculator.subtraction(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
    }

    @Test
    public void testSubtractionResultIsPositive() {
        assertTrue(calculator.subtraction(2, 1) == 1);
    }

    //Tests class "division"
    @Test
    public void testDivisionTwoPositiveNumbers() {
        assertTrue(calculator.division(50, 10) == 5);
    }

    @Test
    public void testDivisionPositiveAndNegativeNumber() {
        assertTrue(calculator.division(100, -10) == -10);
    }

    @Test
    public void testDivisionTwoNegativeNumbers() {
        assertTrue(calculator.division(-100, -10) == 10);
    }

    @Test
    public void testDivisionMinAndMax() {
        assertTrue(calculator.division(Integer.MIN_VALUE, Integer.MAX_VALUE) == -1);
    }

    @Test
    public void testDivisionResultIsNegative() {
        assertTrue(calculator.division(10, -10) == -1);
    }

    @Test
    public void testDivisionResultIsZero() {
        assertTrue(calculator.division(0, 10) == 0);
    }

    @Test
    public void testDivisionResultIsMax() {
        assertTrue(calculator.division(Integer.MAX_VALUE, 1) == Integer.MAX_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionPositiveNumberAndNumberZeroThrowsExpectedException() {
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