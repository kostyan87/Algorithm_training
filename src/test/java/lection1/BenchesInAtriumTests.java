package lection1;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class BenchesInAtriumTests {

    @Test
    public void hasCentralLegTest() {
        assertEquals(List.of(6), BenchesInAtrium.getRemainingLegs(13, List.of(1, 5, 6, 7, 12)));
    }

    @Test
    public void hasOddLengthTest() {
        assertEquals(List.of(5, 8), BenchesInAtrium.getRemainingLegs(13, List.of(1, 5, 8, 12)));
        assertEquals(List.of(4, 8), BenchesInAtrium.getRemainingLegs(13, List.of(1, 4, 8, 11)));
        assertEquals(List.of(1, 8), BenchesInAtrium.getRemainingLegs(9, List.of(1, 8, 9)));
        assertEquals(List.of(2), BenchesInAtrium.getRemainingLegs(5, List.of(0, 2)));
    }

    @Test
    public void hasEvenLengthTest() {
        assertEquals(List.of(5, 6), BenchesInAtrium.getRemainingLegs(12, List.of(1, 5, 6, 8, 12)));
        assertEquals(List.of(6, 8), BenchesInAtrium.getRemainingLegs(14, List.of(1, 6, 8, 11, 12, 13)));
        assertEquals(List.of(2, 7), BenchesInAtrium.getRemainingLegs(8, List.of(2, 7, 8)));
    }
}
