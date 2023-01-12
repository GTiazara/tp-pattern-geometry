package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    public static final double EPSILON = 1.0e-15;

    @Test
    public void testDefaultConstructor(){

        Point p = new Point();
        Assert.assertEquals(0.0,p.getCoordinate().getX(), EPSILON);
        Assert.assertEquals(0.0, p.getCoordinate().getY(), EPSILON);
    }

    @Test
    public void testConstructorWithCoordinate(){
        Coordinate c = new Coordinate(2.0, 2.2);
        Point p = new Point(c);
        Assert.assertEquals(2.0,p.getCoordinate().getX(), EPSILON);
        Assert.assertEquals(2.2, p.getCoordinate().getY(), EPSILON);
    }

    @Test
    public void testGetType(){
        Coordinate c = new Coordinate(2.0, 2.2);
        Point p = new Point(c);
        Assert.assertEquals("POINT",p.getType());
    }

    @Test
    public void testGetCoordinate(){
        Coordinate c = new Coordinate(2.0, 2.2);
        Point p = new Point(c);
        Assert.assertEquals(c,p.getCoordinate());
    }
}
