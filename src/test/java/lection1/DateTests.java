package lection1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateTests {

    @Test
    public void test() {
        assertEquals(1, Date.isUnequivocal(13,10,2008));
        assertEquals(1, Date.isUnequivocal(11,18,2008));
        assertEquals(1, Date.isUnequivocal(12,12,2008));
        assertEquals(0, Date.isUnequivocal(12,11,2008));
    }
}
