package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		// TODO
		Coordinate c = new Coordinate();
		Assert.assertEquals(0.0, c.getX(), EPSILON);
		Assert.assertEquals(0.0, c.getY(), EPSILON);
	}

	@Test
	public void testConstructorWithCoordinate(){
		// TODO
		Coordinate c = new Coordinate(2.0, 2.2);
		Assert.assertEquals(2.0, c.getX(), EPSILON);
		Assert.assertEquals(2.2, c.getY(), EPSILON);
	}

}
