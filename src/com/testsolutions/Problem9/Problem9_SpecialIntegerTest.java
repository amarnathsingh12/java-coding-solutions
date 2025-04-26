package com.testsolutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Problem9_SpecialIntegerTest {

    @Test
    public void testIsSpecialInteger() {
        // Test for special integers
        assertTrue(Problem9_SpecialInteger.isSpecialInteger(59));
        assertTrue(Problem9_SpecialInteger.isSpecialInteger(81));
        assertTrue(Problem9_SpecialInteger.isSpecialInteger(36));
        
        // Test for non-special integers
        assertFalse(Problem9_SpecialInteger.isSpecialInteger(14));
        assertFalse(Problem9_SpecialInteger.isSpecialInteger(25));
        assertFalse(Problem9_SpecialInteger.isSpecialInteger(99));
    }
}
