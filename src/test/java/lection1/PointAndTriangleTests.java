package lection1;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class PointAndTriangleTests {

    @Test
    public void outsideTheTriangleTest() {
        assertEquals(2, PointAndTriangle.getPointLocation(new Point(0, 0),
                new Point(4, 0), new Point(0, 4), new Point(6, -2)));
        assertEquals(1, PointAndTriangle.getPointLocation(new Point(0, 0),
                new Point(4, 0), new Point(0, 4), new Point(-2, -2)));
        assertEquals(3, PointAndTriangle.getPointLocation(new Point(0, 0),
                new Point(4, 0), new Point(0, 4), new Point(0, 6)));
    }

    @Test
    public void outsideTheTriangleWithEqualsDistanceTest() {
        assertEquals(1, PointAndTriangle.getPointLocation(new Point(0, 0),
                new Point(4, 0), new Point(0, 4), new Point(2, -1)));
        assertEquals(1, PointAndTriangle.getPointLocation(new Point(0, 0),
                new Point(4, 0), new Point(0, 4), new Point(-1, 2)));
        assertEquals(2, PointAndTriangle.getPointLocation(new Point(0, 0),
                new Point(4, 0), new Point(0, 4), new Point(4, 4)));
    }

    @Test
    public void insideTheTriangleTest() {
        assertEquals(0, PointAndTriangle.getPointLocation(new Point(0, 0),
                new Point(4, 0), new Point(0, 4), new Point(1, 2)));
        assertEquals(0, PointAndTriangle.getPointLocation(new Point(0, 0),
                new Point(4, 0), new Point(4, 0), new Point(0, 0)));
        assertEquals(0, PointAndTriangle.getPointLocation(new Point(0, 0),
                new Point(4, 0), new Point(0, 4), new Point(0, 2)));
    }
}
