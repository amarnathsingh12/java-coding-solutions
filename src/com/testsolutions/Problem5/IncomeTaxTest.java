package com.testsolutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem5_IncomeTaxTest {

    @Test
    public void testIncomeTax() {
        assertEquals(0.0, Problem5_IncomeTax.calculateIncomeTax(190000));
        assertEquals(9500.0, Problem5_IncomeTax.calculateIncomeTax(345000));
        assertEquals(81000.0, Problem5_IncomeTax.calculateIncomeTax(780000));
        assertEquals(545000.0, Problem5_IncomeTax.calculateIncomeTax(2400000));
    }
}
