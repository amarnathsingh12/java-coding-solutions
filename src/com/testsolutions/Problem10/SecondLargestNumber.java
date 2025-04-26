package com.testsolutions;

import java.util.Scanner;
import java.util.Arrays;

public class Problem10_SecondLargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the input array from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        
        // Populate the array with user input
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Find and display the second largest number
        int secondLargest = findSecondLargest(array);
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number found.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
        
        scanner.close();
    }

    public static int findSecondLargest(int[] array) {
        // Handle cases where there are fewer than 2 elements
        if (array.length < 2) {
            return Integer.MIN_VALUE;  // No second largest number
        }

        // Initialize variables to track the largest and second largest numbers
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Iterate through the array to find the largest and second largest numbers
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;  // Update second largest before largest
                largest = num;  // Update largest number
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;  // Update second largest number
            }
        }
        
        return secondLargest;
    }
}
