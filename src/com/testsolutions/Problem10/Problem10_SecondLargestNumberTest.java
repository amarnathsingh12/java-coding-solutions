package com.testsolutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem10_SecondLargestNumberTest {

    @Test
    public void testFindSecondLargest() {
        // Test arrays with multiple elements
        assertEquals(4, Problem10_SecondLargestNumber.findSecondLargest(new int[]{2, 3, 1, 5, 4}));
        assertEquals(7, Problem10_SecondLargestNumber.findSecondLargest(new int[]{1, 2, 7, 5, 4, 3}));
        assertEquals(10, Problem10_SecondLargestNumber.findSecondLargest(new int[]{11, 10, 15, 7, 9}));
        
        // Test arrays with exactly two elements
        assertEquals(2, Problem10_SecondLargestNumber.findSecondLargest(new int[]{1, 2}));
        
        // Test arrays with all the same elements
        assertEquals(Integer.MIN_VALUE, Problem10_SecondLargestNumber.findSecondLargest(new int[]{5, 5, 5, 5}));
        
        // Test cases with fewer than two elements
        assertEquals(Integer.MIN_VALUE, Problem10_SecondLargestNumber.findSecondLargest(new int[]{1}));
        assertEquals(Integer.MIN_VALUE, Problem10_SecondLargestNumber.findSecondLargest(new int[]{}));
    }
}
