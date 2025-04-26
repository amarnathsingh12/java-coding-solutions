package com.testsolutions;

import java.util.Scanner;

/**
 * Problem 2 - Supermarket Invoice (Gross Price Calculation)
 * This program accepts the net price and tax rate to calculate the gross price
 * (price before taxes).
 */
public class Problem2_SupermarketInvoice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Net price (including taxes)
        System.out.print("Enter the net price (including tax): ");
        double netPrice = scanner.nextDouble();

        // Input: Tax rate (as a decimal, e.g., 0.28 for 28%)
        System.out.print("Enter the tax rate (e.g., 0.28 for 28%): ");
        double taxRate = scanner.nextDouble();

        // Calculate gross price (before tax)
        double grossPrice = calculateGrossPrice(netPrice, taxRate);

        System.out.println("Gross price (before tax): " + grossPrice);

        scanner.close();
    }

    /**
     * Method to calculate the gross price before tax from net price and tax rate.
     * 
     * @param netPrice the price including tax
     * @param taxRate the tax rate (in decimal)
     * @return the gross price (before tax)
     */
    public static double calculateGrossPrice(double netPrice, double taxRate) {
        return netPrice / (1 + taxRate);
    }
}
