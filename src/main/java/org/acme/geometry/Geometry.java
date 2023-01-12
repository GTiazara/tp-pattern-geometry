package org.acme.geometry;

import java.util.EnumMap;

public interface Geometry {

    public String getType();

    public boolean isEmpty();

    public void translate(double dx, double dy);

    public Geometry clone();
    public Enveloppe getEnvelope();

    public void accept(GeometryVisitor geovisit);

}
