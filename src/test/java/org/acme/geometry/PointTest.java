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
        Assert.assertSame(c,p.getCoordinate());
    }

    @Test
    public void testSetCoordinate(){
        Coordinate c = new Coordinate(2.0, 2.2);
        Point p = new Point(c);
        Assert.assertSame(c,p.getCoordinate());
    }

    @Test
    public void testTranslate(){
        Coordinate c1 = new Coordinate(2.0, 2.2);
        Point p1 = new Point(c1);
        p1.translate(1.0, 1.0);

        Coordinate c2 = new Coordinate(3.0, 3.2);

        Assert.assertTrue(p1.getCoordinate().getX() == c2.getX() && p1.getCoordinate().getY() == c2.getY());

    }

    @Test
    public void testClone(){
        Coordinate c1 = new Coordinate(2.0, 2.2);
        Point p1 = new Point(c1);

        Point p2 = p1.clone();
        p2.translate(2.0, 2.0);

        Assert.assertNotEquals(p1,p2);
    }


}
