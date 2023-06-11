package ch1Fundamentals.basicProgrammingModel;

import junit.framework.TestCase;

public class Exercise_1_1_20Test extends TestCase {

    public void testLogarithmOfFactorial() {
        assertEquals(0.0, Exercise_1_1_20.logarithmOfFactorial(0));
        assertEquals(0.0, Exercise_1_1_20.logarithmOfFactorial(1));
        assertEquals(Math.log(24), Exercise_1_1_20.logarithmOfFactorial(4), 0.0000001);
    }
}