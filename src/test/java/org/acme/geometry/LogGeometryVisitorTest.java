package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

public class LogGeometryVisitorTest {

    @Test
    public void testLogVisitor() throws UnsupportedEncodingException {

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(os);
        Point p1 = new Point( new Coordinate(2.0, 3.0));
        LogGeometryVisitor visitor = new LogGeometryVisitor(out);
        p1.accept(visitor);
        String result = os.toString("UTF8");
        //System.out.println(result);

        Assert.assertEquals("Je suis un point avec x=2.0 et y=3.0", result.trim());

    }

    public void testLogVisitorLinestring() throws UnsupportedEncodingException {

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(os);

        Point p1 = new Point( new Coordinate(2.0, 2.2));
        Point p2 = new Point( new Coordinate(3.0, 4.2));
        List<Point> lp= Arrays.asList(p1, p2);

        LineString ls = new LineString(lp);

        LogGeometryVisitor visitor = new LogGeometryVisitor(out);
        ls.accept(visitor);
        String result = os.toString("UTF8");
        //System.out.println(result);

        Assert.assertEquals("Je suis une polyligne définie par 2 point(s)", result.trim());

    }

}
