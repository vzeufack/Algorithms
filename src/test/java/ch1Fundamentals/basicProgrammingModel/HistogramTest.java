package ch1Fundamentals.basicProgrammingModel;

import junit.framework.TestCase;

import java.util.Arrays;

public class HistogramTest extends TestCase {
    public void testHistogram(){
        int[] testCase1 = {0};
        int[] result1 = {1};
        assertTrue(Arrays.equals(result1, Histogram.histogram(testCase1, 1)));

        int[] testCase2 = {0};
        int[] result2 = {1, 0};
        assertTrue(Arrays.equals(result2, Histogram.histogram(testCase2, 2)));

        int[] testCase3 = {0, 1, 0, 0};
        int[] result3 = {3, 1};
        assertTrue(Arrays.equals(result3, Histogram.histogram(testCase3, 2)));

        int[] testCase4 = {0, 5, 0, 0};
        int[] result4 = {3, 0};
        assertTrue(Arrays.equals(result4, Histogram.histogram(testCase4, 2)));

        int[] testCase5 = {0, 1, 1, 4, 9};
        int[] result5 = {1, 2, 0, 0, 1, 0, 0, 0, 0, 1};
        assertTrue(Arrays.equals(result5, Histogram.histogram(testCase5, 10)));
    }
}