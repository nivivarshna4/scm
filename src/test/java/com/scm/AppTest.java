package com.scm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testAddition() {
        int result = App.add(2, 3);
        assertEquals(5, result);
    }
@Test
public void testMultiply() {
    assertEquals(6, App.multiply(2, 3));
}
}
