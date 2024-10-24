package com.example.calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        calculator.divide(10, 0);
    }
}
