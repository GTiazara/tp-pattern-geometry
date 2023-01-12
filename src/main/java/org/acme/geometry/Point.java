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

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void checkEmptyCoordinate()
    {
        if (this.isEmpty())
        {
            this.setCoordinate(new Coordinate(0.0, 0.0));
        }
    }
}
