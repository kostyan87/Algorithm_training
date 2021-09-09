package lection1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SchoolConstructionTests {

    @Test
    public void test() {
        assertEquals(6, SchoolConstruction.getCoordinate(4, new int[]{1, 5, 6, 8}));
        assertEquals(-2, SchoolConstruction.getCoordinate(4, new int[]{-1, -5, 0, 6}));
        assertEquals(0, SchoolConstruction.getCoordinate(1, new int[]{0}));
        assertEquals(5, SchoolConstruction.getCoordinate(4, new int[]{-50, 4, 5, 60}));
    }
}
