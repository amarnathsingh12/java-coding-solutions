package com.testsolutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem4_MedianTest {

    @Test
    public void testMedian() {
        assertEquals(10.7, Problem4_Median.findMedian(new double[]{10.7}));
        assertEquals(2.0, Problem4_Median.findMedian(new double[]{1.0, 2.0, 3.0}));
        assertEquals(30.4, Problem4_Median.findMedian(new double[]{17.4, 21.1, 39.7, 48.0}));
        assertEquals(-384.0, Problem4_Median.findMedian(new double[]{-957.0, -493.0, -384.0, -268.0, -131.0}));
        assertEquals(-1.0, Problem4_Median.findMedian(new double[]{}));
    }
}
