package com.testsolutions;

import java.util.Scanner;

public class Problem8_TimeConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the input seconds from the user
        System.out.print("Enter the number of seconds: ");
        long totalSeconds = scanner.nextLong();
        
        // Convert seconds to days, hours, minutes, and remaining seconds
        String result = convertSecondsToTime(totalSeconds);
        
        System.out.println(result);
        
        scanner.close();
    }

    public static String convertSecondsToTime(long totalSeconds) {
        // Constants for time units
        long secondsInMinute = 60;
        long secondsInHour = 60 * secondsInMinute;
        long secondsInDay = 24 * secondsInHour;

        // Calculate days, hours, minutes, and seconds
        long days = totalSeconds / secondsInDay;
        long remainingSeconds = totalSeconds % secondsInDay;
        
        long hours = remainingSeconds / secondsInHour;
        remainingSeconds %= secondsInHour;
        
        long minutes = remainingSeconds / secondsInMinute;
        long seconds = remainingSeconds % secondsInMinute;
        
        return String.format("%d Day(s) %d Hour(s) %d Minute(s) %d Second(s)", days, hours, minutes, seconds);
    }
}
