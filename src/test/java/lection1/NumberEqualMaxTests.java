package lection1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NumberEqualMaxTests {

    @Test
    public void emptySequenceTest() {
        assertEquals(0, NumberEqualMax.getEqualToLargestElement(List.of()));
    }

    @Test
    public void notEmptySequenceTest() {
        assertEquals(4, NumberEqualMax.getEqualToLargestElement(List.of(4, 4, 4, 4)));
        assertEquals(2, NumberEqualMax.getEqualToLargestElement(List.of(2, 4, 4, 1)));
        assertEquals(1, NumberEqualMax.getEqualToLargestElement(List.of(4, 3, 3, 3)));
        assertEquals(1, NumberEqualMax.getEqualToLargestElement(List.of(3, 3, 3, 4)));
    }
}
