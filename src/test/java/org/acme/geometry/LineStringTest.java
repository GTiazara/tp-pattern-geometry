package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;



import java.util.Arrays;
import java.util.List;

public class LineStringTest {
    public static final double EPSILON = 1.0e-15;

    @Test
    public void testDefaultConstructor(){
        LineString ls = new LineString();
        Assert.assertEquals(0,ls.getNumPoints(), EPSILON);

    }

    @Test
    public void testConstructorWithListPoint(){
        Point p1 = new Point( new Coordinate(2.0, 2.2));
        Point p2 = new Point( new Coordinate(3.0, 4.2));
        Point p3 = new Point( new Coordinate(8.0, 2.2));
        List<Point> lp= Arrays.asList(p1, p2, p3);

        LineString ls = new LineString(lp);
        Assert.assertEquals(3,ls.getNumPoints(), EPSILON);

    }

    @Test
    public void testGetNumPoints(){
        Point p1 = new Point( new Coordinate(2.0, 2.2));
        Point p2 = new Point( new Coordinate(3.0, 4.2));
        Point p3 = new Point( new Coordinate(8.0, 2.2));
        List<Point> lp= Arrays.asList(p1, p2, p3);

        LineString ls = new LineString(lp);
        Assert.assertEquals(p3,ls.getPointN(2));

    }

    @Test
    public void testGetType(){
        LineString ls = new LineString();
        Assert.assertEquals("LINESTRING",ls.getType());
    }


    }
