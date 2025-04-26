package com.testsolutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem6_MostVowelsTest {

    @Test
    public void testFindStringWithMostVowels() {
        assertEquals("Resourceful", Problem6_MostVowels.findStringWithMostVowels(new String[]{"Sunshine", "Umbrella", "Major", "Resourceful"}));
        assertEquals("Umbrella", Problem6_MostVowels.findStringWithMostVowels(new String[]{"Sunshine", "Umbrella", "Major"}));
        assertEquals("Sunshine", Problem6_MostVowels.findStringWithMostVowels(new String[]{"Sunshine", "Major"}));
        assertEquals("Umbrella", Problem6_MostVowels.findStringWithMostVowels(new String[]{"Umbrella", "Major"}));
        assertEquals("A", Problem6_MostVowels.findStringWithMostVowels(new String[]{"A", "B", "C"}));
    }
}
