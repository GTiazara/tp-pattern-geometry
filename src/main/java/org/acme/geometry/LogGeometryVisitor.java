package org.acme.geometry;

import java.io.PrintStream;

public class LogGeometryVisitor implements GeometryVisitor {

    private PrintStream out;


    public LogGeometryVisitor() {
        this(System.out);
    }

    public LogGeometryVisitor(PrintStream out) {
        this.out = out;
    }

    @Override
    public void visit(Point p) {
        //System.out.println("Je suis un point avec x="+p.getCoordinate().getX() +" et y=" + p.getCoordinate().getY());
        this.out.println("Je suis un point avec x="+p.getCoordinate().getX() +" et y=" + p.getCoordinate().getY() );
    }

    @Override
    public void visit(LineString ls) {
        this.out.println(String.format("Je suis une polyligne définie par %1$i point(s)", ls.getNumPoints()));
    }
}
