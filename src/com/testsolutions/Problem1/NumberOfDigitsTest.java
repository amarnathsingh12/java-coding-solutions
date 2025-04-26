package com.testsolutions;

/**
 * Manual Test Class for Problem 1 - Number of Digits
 */
public class Problem1_NumberOfDigitsTest {

    public static void main(String[] args) {
        testCountDigits();
    }

    private static void testCountDigits() {
        assertTest(34, 2);
        assertTest(-7291, 4);
        assertTest(0, 1);
        assertTest(123456789, 9);
        assertTest(-1, 1);
    }

    private static void assertTest(int input, int expectedOutput) {
        int result = Problem1_NumberOfDigits.countDigits(input);
        if (result == expectedOutput) {
            System.out.println("Test Passed for input: " + input);
        } else {
            System.out.println("Test Failed for input: " + input + ". Expected: " + expectedOutput + ", Got: " + result);
        }
    }
}
