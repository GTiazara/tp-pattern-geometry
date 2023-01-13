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
        Assert.assertSame(p3,ls.getPointN(2));

    }

    @Test
    public void testGetType(){
        LineString ls = new LineString();
        Assert.assertEquals("LINESTRING",ls.getType());
    }

    @Test
    public void testTranslate(){
        Point p1 = new Point( new Coordinate(2.0, 2.2));
        Point p2 = new Point( new Coordinate(3.0, 4.2));
        Point p3 = new Point( new Coordinate(8.0, 2.2));
        List<Point> lp= Arrays.asList(p1, p2, p3);

        LineString ls = new LineString(lp);
        ls.translate(1.0, 1.0);

        Point p1Trans = new Point( new Coordinate(3.0, 3.2));
        Point p2Trans  = new Point( new Coordinate(4.0, 5.2));
        Point p3Trans  = new Point( new Coordinate(9.0, 3.2));

        Assert.assertTrue(ls.getPointN(0).getCoordinate().getX() == p1Trans.getCoordinate().getX()
                && ls.getPointN(1).getCoordinate().getX() == p2Trans.getCoordinate().getX()
                && ls.getPointN(2).getCoordinate().getX() == p3Trans.getCoordinate().getX()
        );
    }

    @Test
    public void testClone(){
        Point p1 = new Point( new Coordinate(2.0, 2.2));
        Point p2 = new Point( new Coordinate(3.0, 4.2));
        Point p3 = new Point( new Coordinate(8.0, 2.2));
        List<Point> lp= Arrays.asList(p1, p2, p3);

        LineString ls = new LineString(lp);
        LineString lsClone = (LineString) ls.clone();

        Assert.assertNotEquals(ls,lsClone);
    }

    @Test
    public void testGetEnveloppe(){
        Point p1 = new Point( new Coordinate(2.0, 2.2));
        Point p2 = new Point( new Coordinate(3.0, 4.2));
        Point p3 = new Point( new Coordinate(8.0, 2.2));
        List<Point> lp= Arrays.asList(p1, p2, p3);

        LineString ls = new LineString(lp);
        Enveloppe enveloppe = ls.getEnvelope();

        Assert.assertEquals(2.0, enveloppe.getXmin(), EPSILON);
        Assert.assertEquals(8.0, enveloppe.getXmax(), EPSILON);
        Assert.assertEquals(2.2, enveloppe.getYmin(), EPSILON);
        Assert.assertEquals(4.2, enveloppe.getYmax(), EPSILON);
    }


}
