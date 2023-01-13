package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractGeometry implements Geometry {
    @Override
    public String getType() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void translate(double dx, double dy) {

    }
/*
    @Override
    public Geometry clone() {
        return null;
    }*/

    @Override
    public Enveloppe getEnvelope() {
        return null;
    }

    @Override
    public void accept(GeometryVisitor geovisit) {

    }

    public String asText()
    {
        WktVisitor visitor = new WktVisitor();

        this.accept(visitor);

        return (visitor.getResult());

    }

    public AbstractGeometry clone()
    {
        if (this instanceof Point)
        {
            return new Point( ((Point) this).getCoordinate());
        }
        //else if(this instanceof LineString)
        else
        {
            List<Point> lp = new ArrayList<>();

            for(int i =0; i <((LineString) this).getNumPoints();i++)
            {
                Point p = new Point(((LineString) this).getPointN(i).getCoordinate());
                lp.add(p);
            }
            LineString ls = new LineString(lp);
            return ls;
        }

    };

}
