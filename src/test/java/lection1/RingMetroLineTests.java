package lection1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RingMetroLineTests {

    @Test
    public void test() {
        assertEquals(1, RingMetroLine.getMinNumStations(100,99,1));
        assertEquals(2, RingMetroLine.getMinNumStations(100,99,2));
        assertEquals(2, RingMetroLine.getMinNumStations(100,3,100));
        assertEquals(0, RingMetroLine.getMinNumStations(100,1,100));
    }
}
