package com.example.wordcounteroldsch;

import static org.junit.Assert.*;

import org.junit.Test;

public class TextMetricsCounterTest {

    @Test
    public void testGetWordsCount() {
        String text = "Hello World, it is a test.";
        int expectedWordCount = 6;
        int actualWordCount = TextMetricsCounter.getWordsCount(text);

        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void testGetCharsCount() {
        String text = "Android";
        int expectedCharCount = 7;
        int actualCharCount = TextMetricsCounter.getCharsCount(text);

        assertEquals(expectedCharCount, actualCharCount);
    }

    @Test
    public void testEmptyString() {
        String text = "";

        assertEquals(0, TextMetricsCounter.getWordsCount(text));
        assertEquals(0, TextMetricsCounter.getCharsCount(text));
    }

    @Test
    public void testNullString() {
        assertEquals(0, TextMetricsCounter.getWordsCount(null));
        assertEquals(0, TextMetricsCounter.getCharsCount(null));
    }
}