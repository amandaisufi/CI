package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(7, calculator.add(3,4));
        assertNotEquals(9, calculator.add(5,5));
    }

    @Test
    void subtract() {
        assertEquals(7, calculator.subtract(10,3));
        assertNotEquals(9, calculator.subtract(10,2));
    }

    @Test
    void multiply() {
        assertEquals(15, calculator.multiply(3,5));
        assertNotEquals(9, calculator.multiply(3,2));
    }

    @Test
    void divide() {
        assertEquals(10, calculator.divide(20,2));
        assertNotEquals(9, calculator.divide(20,5));

    }

}
