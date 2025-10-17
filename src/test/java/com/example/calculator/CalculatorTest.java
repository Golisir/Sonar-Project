package com.example.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

   /* @Test
    @DisplayName("add: 2 + 3 = 5")
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(-1, calc.add(-2, 1));
    } */

    @Test
    @DisplayName("subtract: 7 - 4 = 3")
    void testSubtract() {
        assertEquals(3, calc.subtract(7, 4));
        assertEquals(-9, calc.subtract(-5, 4));
    }

    @Test
    @DisplayName("multiply: 6 * 7 = 42")
    void testMultiply() {
        assertEquals(42, calc.multiply(6, 7));
        assertEquals(0, calc.multiply(0, 99));
    }

    @Test
    @DisplayName("divide: 8 / 2 = 4")
    void testDivide() {
        assertEquals(4, calc.divide(8, 2));
        assertEquals(-3, calc.divide(-9, 3));
    }

    @Test
    @DisplayName("divide by zero throws")
    void testDivideByZero() {
        IllegalArgumentException ex = assertThrows(
            IllegalArgumentException.class,
            () -> calc.divide(1, 0)
        );
        assertTrue(ex.getMessage().contains("zero"));
    }
}
