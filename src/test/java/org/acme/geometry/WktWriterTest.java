package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class WktWriterTest {
    @Test
    public void testWrite(){

        Geometry g = new Point(new Coordinate(3.0,4.0));
        WktWriter writer = new WktWriter();
        Assert.assertEquals("POINT(3.0 4.0)", writer.write(g));
    }
    @Test
    public void testWriteLinestring(){

        Point p1 = new Point( new Coordinate(2.0, 2.2));
        Point p2 = new Point( new Coordinate(3.0, 4.2));
        List<Point> lp= Arrays.asList(p1, p2);

        Geometry g = new LineString(lp);

        WktWriter writer = new WktWriter();
        Assert.assertEquals("LINESTRING(2.0 2.2,3.0 4.2)", writer.write(g));
    }

}
