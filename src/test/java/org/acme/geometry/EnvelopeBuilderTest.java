package org.acme.geometry;

import org.junit.Assert;

import org.junit.Test;
public class EnvelopeBuilderTest
{
    public static final double EPSILON = 1.0e-15;
    @Test
    public void testInsert(){
        Coordinate c1 = new Coordinate(2.0, 2.2);
        Coordinate c2 = new Coordinate(3.0, 4.2);
        Coordinate c3 = new Coordinate(4.0, 5.2);
        Coordinate c4 = new Coordinate(1.0, 10.2);

        EnvelopeBuilder envpBuild = new EnvelopeBuilder();
        envpBuild.insert(c1);
        envpBuild.insert(c2);
        envpBuild.insert(c3);
        envpBuild.insert(c4);

        Enveloppe env = envpBuild.build();

        Assert.assertEquals(1.0,env.getXmin(),EPSILON);
        Assert.assertEquals(4.0,env.getXmax(),EPSILON);
        Assert.assertEquals(2.2,env.getYmin(),EPSILON);
        Assert.assertEquals(10.2,env.getYmax(),EPSILON);
    }

}
