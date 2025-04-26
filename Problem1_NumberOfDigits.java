package com.testsolutions;

import java.util.Scanner;

public class Problem1_NumberOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int digits = countDigits(number);
        System.out.println(digits);

        scanner.close();
    }

    public static int countDigits(int number) {
        number = Math.abs(number); 
        if (number == 0) return 1;

        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
