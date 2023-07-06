package ch1Fundamentals.basicProgrammingModel;

import junit.framework.TestCase;

import java.util.Arrays;

public class Exercise_1_1_30Test extends TestCase {

    public void testCreateCoprimeArray() {
        boolean[][] expectedFor1By1 = {{false}};

        boolean[][] expectedFor3By3 = {{false, false, false},
                                       {false, true, true},
                                       {false, true, false}};

        boolean[][] expectedFor5By5 = {{false, false, false, false, false},
                                        {false, true, true, true, true},
                                        {false, true, false, true, false},
                                        {false, true, true, false, true},
                                        {false, true, false, true, false}};

        assertTrue(Arrays.deepEquals(expectedFor1By1, Exercise_1_1_30.createCoprimeArray(1)));
        assertTrue(Arrays.deepEquals(expectedFor3By3, Exercise_1_1_30.createCoprimeArray(3)));
        assertTrue(Arrays.deepEquals(expectedFor5By5, Exercise_1_1_30.createCoprimeArray(5)));
    }
}