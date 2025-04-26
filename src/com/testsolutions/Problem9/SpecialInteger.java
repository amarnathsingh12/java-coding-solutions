package com.testsolutions;

import java.util.Scanner;

public class Problem9_SpecialInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the input number
        System.out.print("Enter a two-digit integer: ");
        int number = scanner.nextInt();
        
        // Check if it's a special two-digit integer
        if (isSpecialInteger(number)) {
            System.out.println(number + " is a special two-digit integer.");
        } else {
            System.out.println(number + " is not a special two-digit integer.");
        }
        
        scanner.close();
    }

    public static boolean isSpecialInteger(int number) {
        // Check if the number is a two-digit number
        if (number < 10 || number > 99) {
            return false;
        }

        // Extract digits
        int tensDigit = number / 10;  // Get the tens digit
        int onesDigit = number % 10;  // Get the ones digit

        // Check if the number satisfies the special integer condition
        return (tensDigit + onesDigit + (tensDigit * onesDigit)) == number;
    }
}
