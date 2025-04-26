package com.testsolutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem3_LargerNumberTest {

    @Test
    public void testLargerNumber() {
        assertEquals(10.5, getLarger(10.5, 7.3));
        assertEquals(20.5, getLarger(20.5, 20.5));
        assertEquals(-5.0, getLarger(-10.5, -5.0));
        assertEquals(0.0, getLarger(0.0, -10.0));
    }

    // Helper method for testing
    private double getLarger(double num1, double num2) {
        return (num1 > num2) ? num1 : num2;
    }
}
