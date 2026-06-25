package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    Main calc = new Main();

    @Test
    void testAssertions() {

        assertEquals(5, calc.add(2, 3));

        assertTrue(calc.isGreater(5, 3));

        assertFalse(calc.isGreater(3, 5));

        assertNull(calc.getNullValue());

        assertNotNull(calc.getMessage());
    }
}