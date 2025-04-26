package com.testsolutions;

import java.util.Scanner;

public class Problem6_MostVowels {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Array of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character after the integer input
        
        String[] strings = new String[n];
        
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        
        String stringWithMostVowels = findStringWithMostVowels(strings);
        
        System.out.println("The string with the most vowels is: " + stringWithMostVowels);
        
        scanner.close();
    }

    public static String findStringWithMostVowels(String[] strings) {
        String result = "";
        int maxVowelsCount = 0;

        for (String str : strings) {
            int vowelsCount = countVowels(str);
            if (vowelsCount > maxVowelsCount) {
                maxVowelsCount = vowelsCount;
                result = str;
            }
        }

        return result;
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }
}
