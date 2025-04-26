package com.testsolutions;

import java.util.Scanner;

public class Problem4_Median {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Sorted array of numbers
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        if (n == 0) {
            System.out.println("Median: -1.0");
            return;
        }
        
        double[] array = new double[n];
        
        System.out.println("Enter the elements of the array (sorted):");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }
        
        double median = findMedian(array);
        System.out.println("The median is: " + median);
        
        scanner.close();
    }

    public static double findMedian(double[] array) {
        int n = array.length;
        
        // If the array has an odd number of elements
        if (n % 2 != 0) {
            return array[n / 2];
        } else {
            // If the array has an even number of elements
            return (array[(n - 1) / 2] + array[n / 2]) / 2.0;
        }
    }
}
