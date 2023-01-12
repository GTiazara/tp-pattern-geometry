package org.acme.geometry;

public class Point implements Geometry{
    private Coordinate coordinate;

    public Point() {
        this.coordinate = new Coordinate();
        this.checkEmptyCoordinate();
    }

    public Point(Coordinate coordinate) {
        this.coordinate = coordinate;
    }


    @Override
    public String getType() {
        return "POINT";
    }

    @Override
    public boolean isEmpty() {
        return this.coordinate.isEmpty();
    }

    @Override
    public void translate(double dx, double dy) {

        this.coordinate = new Coordinate(this.coordinate.getX() + dx, this.coordinate.getY() + dy);
    }

    @Override
    public Point clone() {
        return new Point(this.coordinate);
    }

    @Override
    public Enveloppe getEnvelope() {
        EnvelopeBuilder envpBuild = new EnvelopeBuilder();
        envpBuild.insert(this.getCoordinate());
        return (envpBuild.build());
    }

    public Coordinate getCoordinate() {
        return this.coordinate;
    }

    public void checkEmptyCoordinate()
    {
        if (this.isEmpty())
        {
            this.coordinate = new Coordinate(0.0, 0.0);
        }
    }
}
