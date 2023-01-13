package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AbstractGeometryTest {

    @Test
    public void testAsTextPoint(){
        Point p = new Point(new Coordinate(3.0,4.0));
        Assert.assertEquals( "POINT(3.0 4.0)", p.asText() );
    }

    @Test
    public void testAsTextLineString(){
        Point p1 = new Point( new Coordinate(2.0, 2.2));
        Point p2 = new Point( new Coordinate(3.0, 4.2));
        List<Point> lp= Arrays.asList(p1, p2);

        LineString ls = new LineString(lp);

        Assert.assertEquals( "LINESTRING(2.0 2.2,3.0 4.2)", ls.asText() );
    }

}
