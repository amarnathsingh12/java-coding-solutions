package com.testsolutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem8_TimeConversionTest {

    @Test
    public void testConvertSecondsToTime() {
        // Test for 21893872 seconds
        assertEquals("253 Day(s) 9 Hour(s) 37 Minute(s) 52 Second(s)", Problem8_TimeConversion.convertSecondsToTime(21893872));
        
        // Test for 3661 seconds (1 hour, 1 minute, 1 second)
        assertEquals("0 Day(s) 1 Hour(s) 1 Minute(s) 1 Second(s)", Problem8_TimeConversion.convertSecondsToTime(3661));
        
        // Test for 86400 seconds (exactly 1 day)
        assertEquals("1 Day(s) 0 Hour(s) 0 Minute(s) 0 Second(s)", Problem8_TimeConversion.convertSecondsToTime(86400));
        
        // Test for 3600 seconds (exactly 1 hour)
        assertEquals("0 Day(s) 1 Hour(s) 0 Minute(s) 0 Second(s)", Problem8_TimeConversion.convertSecondsToTime(3600));
        
        // Test for 0 seconds
        assertEquals("0 Day(s) 0 Hour(s) 0 Minute(s) 0 Second(s)", Problem8_TimeConversion.convertSecondsToTime(0));
    }
}
