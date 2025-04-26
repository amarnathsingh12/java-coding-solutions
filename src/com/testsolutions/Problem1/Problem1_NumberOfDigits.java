package com.testsolutions;

import java.util.Scanner;

/**
 * Problem 1 - Number of Digits in an Integer
 * This program accepts an integer and prints the number of digits in it.
 */
public class Problem1_NumberOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int digits = countDigits(number);

        System.out.println("Number of digits: " + digits);

        scanner.close();
    }

    /**
     * Method to count the number of digits in an integer.
     * Handles negative numbers as well.
     * 
     * @param number the input integer
     * @return the number of digits
     */
    public static int countDigits(int number) {
        number = Math.abs(number); // handle negative numbers
        if (number == 0) {
            return 1;
        }
        
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
