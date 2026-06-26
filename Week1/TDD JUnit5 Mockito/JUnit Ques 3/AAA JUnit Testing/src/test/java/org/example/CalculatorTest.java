package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        System.out.println("Setup executed");
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Teardown executed");
        calculator = null;
    }

    @Test
    public void testAddition() {

        int a = 10;
        int b = 5;

        int result = calculator.add(a, b);

        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {

        int a = 10;
        int b = 5;

        int result = calculator.subtract(a, b);

        assertEquals(5, result);
    }
}