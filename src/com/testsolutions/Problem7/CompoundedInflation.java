package com.testsolutions;

import java.util.Scanner;

public class Problem7_CompoundedInflation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the inflation rate and number of years
        System.out.print("Enter the annual inflation rate (in percentage): ");
        double inflationRate = scanner.nextDouble() / 100; // convert percentage to decimal
        
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        
        // Calculate compounded inflation
        double compoundedInflation = calculateCompoundedInflation(inflationRate, years);
        
        System.out.printf("The compounded inflation after %d years is: %.2f%%\n", years, compoundedInflation * 100);
        
        scanner.close();
    }
    
    public static double calculateCompoundedInflation(double rate, int years) {
        return Math.pow(1 + rate, years) - 1; // Formula for compounded inflation
    }
}
