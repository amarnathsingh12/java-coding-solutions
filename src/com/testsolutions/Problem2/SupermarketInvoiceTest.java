package com.testsolutions;

/**
 * Manual Test Class for Problem 2 - Supermarket Invoice (Gross Price Calculation)
 */
public class Problem2_SupermarketInvoiceTest {

    public static void main(String[] args) {
        testCalculateGrossPrice();
    }

    private static void testCalculateGrossPrice() {
        assertTest(49999.00, 0.28, 39061.72);
        assertTest(720.00, 0.12, 640.00);
        assertTest(99.95, 0.12, 89.24);
        assertTest(685.71, 0.05, 652.06);
        assertTest(45.00, 0.00, 45.00);
    }

    private static void assertTest(double netPrice, double taxRate, double expectedGrossPrice) {
        double result = Problem2_SupermarketInvoice.calculateGrossPrice(netPrice, taxRate);
        if (Math.abs(result - expectedGrossPrice) < 0.01) {  // Allow a small margin for floating-point comparisons
            System.out.println("Test Passed for Net Price: " + netPrice + " with Tax Rate: " + taxRate);
        } else {
            System.out.println("Test Failed for Net Price: " + netPrice + " with Tax Rate: " + taxRate + 
                               ". Expected: " + expectedGrossPrice + ", Got: " + result);
        }
    }
}
s