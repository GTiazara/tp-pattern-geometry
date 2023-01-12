package org.acme.geometry;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnvelopeBuilder {

    private List<Double> xVals;

    private List<Double> yVals;

    public EnvelopeBuilder() {
        this.xVals = new ArrayList<>();
        this.yVals = new ArrayList<>();
    }

    public void insert(Coordinate c)
    {
        xVals.add(c.getX());
        yVals.add(c.getY());
    }

    public Enveloppe build()
    {
        double xmin = Collections.min(xVals);
        double xmax = Collections.max(xVals);

        double ymin = Collections.min(yVals);
        double ymax = Collections.max(yVals);

        Coordinate bottomLeft = new Coordinate(xmin, ymin);
        Coordinate topRight = new Coordinate(xmax, ymax);

        return (new Enveloppe(bottomLeft, topRight));
    }
}
