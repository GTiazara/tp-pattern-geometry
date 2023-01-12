package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class LineString implements Geometry{
    private List<Point> points;
    public LineString()
    {
        this.points = new ArrayList<>();
    }
    public LineString(List<Point> points) {
        if(points != null ) {
            this.points = points;
        }
        else{
            this.points = new ArrayList<>();
        }
    }

    public int getNumPoints()
    {
        return this.points.size();
    }

    public Point getPointN(int n)
    {
        return points.get(n);
    }


    @Override
    public String getType() {
        return "LINESTRING";
    }

    @Override
    public boolean isEmpty()
    {
            return (this.points.size() == 0);
    }

    @Override
    public void translate(double dx, double dy) {
        if(!this.points.isEmpty())
        {
            for(Point p: this.points)
            {
                p.translate(dx, dy);
            }
        }
    }
    @Override
    public LineString clone() {
        LineString ls = new LineString();
        for(Point p: this.points)
        {
            ls.points.add(p.clone());
        }
        return ls;
    }

    @Override
    public Enveloppe getEnvelope() {
        EnvelopeBuilder envpBuild = new EnvelopeBuilder();
        for(Point p: this.points)
        {
            envpBuild.insert(p.getCoordinate());
        }

        return (envpBuild.build());
    }

    @Override
    public void accept(GeometryVisitor geovisit) {
        geovisit.visit(this);
    }
}
