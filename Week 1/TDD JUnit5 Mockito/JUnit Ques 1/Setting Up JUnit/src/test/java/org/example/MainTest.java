package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testAdd() {
        Main obj = new Main();
        assertEquals(8, obj.add(5, 3));
    }
}