package com.testsolutions;

import java.util.Scanner;

public class Problem3_LargerNumber {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        // Determine and display the larger number
        double larger = (num1 > num2) ? num1 : num2;
        System.out.println("The larger number is: " + larger);
        
        scanner.close();
    }
}
