package ch1Fundamentals.basicProgrammingModel;

import junit.framework.TestCase;

public class LogBase2FloorTest extends TestCase {

    public void testGetFloorOfLogBase2Of() {
        assertEquals(0, LogBase2Floor.getFloorOfLogBase2Of(1));
        assertEquals(1, LogBase2Floor.getFloorOfLogBase2Of(2));
        assertEquals(5, LogBase2Floor.getFloorOfLogBase2Of(50));
        assertEquals(6, LogBase2Floor.getFloorOfLogBase2Of(100));
    }
}