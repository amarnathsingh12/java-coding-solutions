package com.testsolutions;

import java.util.Scanner;

public class Problem5_IncomeTax {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the income from the user
        System.out.print("Enter the taxable income: ");
        double income = scanner.nextDouble();
        
        // Calculate income tax
        double tax = calculateIncomeTax(income);
        
        System.out.println("The income tax is: Rs." + tax);
        
        scanner.close();
    }
    
    public static double calculateIncomeTax(double income) {
        double tax = 0.0;
        
        // Income up to Rs.2,50,000 is not taxed
        if (income <= 250000) {
            tax = 0.0;
        }
        // Income over Rs.2,50,000 but up to Rs.5,00,000
        else if (income <= 500000) {
            tax = (income - 250000) * 0.10;
        }
        // Income over Rs.5,00,000 but up to Rs.10,00,000
        else if (income <= 1000000) {
            tax = (500000 - 250000) * 0.10 + (income - 500000) * 0.20;
        }
        // Income over Rs.10,00,000
        else {
            tax = (500000 - 250000) * 0.10 + (1000000 - 500000) * 0.20 + (income - 1000000) * 0.30;
        }
        
        return tax;
    }
}
