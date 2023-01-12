package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class WktVisitorTest {
    @Test
    public void testWktVisitorPoint(){
        WktVisitor visitor = new WktVisitor();
        Geometry geometry = new Point(new Coordinate(3.0,4.0));
        geometry.accept(visitor);
        Assert.assertEquals( "POINT(3.0 4.0)", visitor.getResult() );
    }
    @Test
    public void testWktVisitorLineString(){
        WktVisitor visitor = new WktVisitor();

        Point p1 = new Point( new Coordinate(2.0, 2.2));
        Point p2 = new Point( new Coordinate(3.0, 4.2));
        List<Point> lp= Arrays.asList(p1, p2);

        Geometry geometry = new LineString(lp);

        geometry.accept(visitor);

        Assert.assertEquals("LINESTRING(2.0 2.2,3.0 4.2)", visitor.getResult());
    }

}
