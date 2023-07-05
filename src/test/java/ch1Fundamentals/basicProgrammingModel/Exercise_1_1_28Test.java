package ch1Fundamentals.basicProgrammingModel;

import junit.framework.TestCase;

public class Exercise_1_1_28Test extends TestCase {
    int[] array;
    @Override
    protected void setUp() throws Exception {
        array = new int[]{0, 0, 1, 1, 1, 1, 3, 3, 3};
    }

    public void testRankWithKeyPresent() {
        assertEquals(6, Exercise_1_1_28.rank(array, 3));
    }

    public void testRankWithKeyAbsent() {
        assertEquals(6, Exercise_1_1_28.rank(array, 2));
    }

    public void testRankWithKeyGreaterThanAllElements() {
        assertEquals(9, Exercise_1_1_28.rank(array, 4));
    }

    public void testRankWithKeySmallerThanAllElements() {
        assertEquals(0, Exercise_1_1_28.rank(array, -1));
    }

    public void testCountWithKeyPresent() {
        assertEquals(3, Exercise_1_1_28.count(array, 3));
    }

    public void testCountWithKeyAbsent() {
        assertEquals(0, Exercise_1_1_28.count(array, 2));
        assertEquals(0, Exercise_1_1_28.count(array, 4));
        assertEquals(0, Exercise_1_1_28.count(array, -1));
    }
}