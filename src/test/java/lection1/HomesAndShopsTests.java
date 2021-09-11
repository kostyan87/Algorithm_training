package lection1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomesAndShopsTests {

    @Test
    public void test() {
        assertEquals(9,
                HomesAndShops.getGreatestDistanceFromHomeToStore(
                        new int[]{1, 0, 1, 1, 0, 1, 0, 1, 1, 2}
                ));
        assertEquals(9,
                HomesAndShops.getGreatestDistanceFromHomeToStore(
                        new int[]{2, 0, 1, 1, 0, 1, 0, 1, 1, 1}
                ));
        assertEquals(4,
                HomesAndShops.getGreatestDistanceFromHomeToStore(
                        new int[]{1, 2, 1, 1, 0, 1, 0, 1, 1, 2}
                ));
    }
}
