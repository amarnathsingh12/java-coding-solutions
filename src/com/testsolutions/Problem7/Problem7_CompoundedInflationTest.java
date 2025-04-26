package com.testsolutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem7_CompoundedInflationTest {

    @Test
    public void testCalculateCompoundedInflation() {
        // Test for inflation rate 20% over 5 years
        assertEquals(2.48832, Problem7_CompoundedInflation.calculateCompoundedInflation(0.20, 5), 0.00001);
        
        // Test for inflation rate 10% over 3 years
        assertEquals(0.331, Problem7_CompoundedInflation.calculateCompoundedInflation(0.10, 3), 0.00001);
        
        // Test for inflation rate 0% over 10 years (no inflation)
        assertEquals(0.0, Problem7_CompoundedInflation.calculateCompoundedInflation(0.0, 10), 0.00001);
        
        // Test for inflation rate 5% over 7 years
        assertEquals(0.407, Problem7_CompoundedInflation.calculateCompoundedInflation(0.05, 7), 0.00001);
    }
}
