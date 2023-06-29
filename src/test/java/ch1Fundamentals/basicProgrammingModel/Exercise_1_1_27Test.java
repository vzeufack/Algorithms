package ch1Fundamentals.basicProgrammingModel;

import junit.framework.TestCase;

public class Exercise_1_1_27Test extends TestCase {

    public void testEnhancedBinomial() {
        assertEquals(Exercise_1_1_27.binomial(10, 5, 0.25), Exercise_1_1_27.enhancedBinomial(10, 5, 0.25));
        assertEquals(Exercise_1_1_27.binomial(50, 5, 0.25), Exercise_1_1_27.enhancedBinomial(50, 5, 0.25));
        assertEquals(Exercise_1_1_27.binomial(-50, 5, 0.25), Exercise_1_1_27.enhancedBinomial(-50, 5, 0.25));
        assertEquals(Exercise_1_1_27.binomial(50, -5, 0.25), Exercise_1_1_27.enhancedBinomial(50, -5, 0.25));
        assertEquals(Exercise_1_1_27.binomial(-50, -5, 0.25), Exercise_1_1_27.enhancedBinomial(-50, -5, 0.25));
    }
}