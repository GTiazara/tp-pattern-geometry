package org.acme.geometry;

public class Enveloppe {
    private Coordinate bottomLeft;
    private Coordinate topRight;

    public Enveloppe() {

    }

    public Enveloppe(Coordinate bottomLeft, Coordinate topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean isEmpty()
    {
        return (this.bottomLeft == null || this.topRight == null );
    }
    public double getXmin()
    {
        return this.bottomLeft.getX();
    }

    public double getYmin()
    {
        return this.bottomLeft.getY();
    }
    public double getXmax()
    {
        return this.topRight.getX();
    }
    public double getYmax()
    {
        return this.topRight.getY();
    }


}
