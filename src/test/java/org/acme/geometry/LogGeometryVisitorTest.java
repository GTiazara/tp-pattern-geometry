package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class LogGeometryVisitorTest {

    @Test
    public void testLogVisiitor() throws UnsupportedEncodingException {

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(os);
        Point p1 = new Point( new Coordinate(2.0, 3.0));
        LogGeometryVisitor visitor = new LogGeometryVisitor(out);
        p1.accept(visitor);
        String result = os.toString("UTF8");
        //System.out.println(result);

        Assert.assertEquals("Je suis un point avec x=2.0 et y=3.0", result.trim());

    }

}
