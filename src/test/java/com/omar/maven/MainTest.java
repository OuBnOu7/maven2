package com.omar.maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MainTest {
    @Test
    public void testAddition() {
        assertEquals(2, Main.addition(1, 1));
        assertNotEquals(3, Main.addition(1, 1));
        assertEquals(0, Main.addition(-1, 1));
    }



}
