package org.acme.geometry;

public class WktVisitor implements GeometryVisitor{

    private StringBuffer buffer;

    public String getResult()
    {
        return this.buffer.toString();
    }

    @Override
    public void visit(Point p) {
        this.buffer =new StringBuffer();
        WktWriter wkt = new WktWriter();
        this.buffer.append(wkt.write(p));
    }

    @Override
    public void visit(LineString ls) {
        this.buffer =new StringBuffer();
        WktWriter wkt = new WktWriter();
        this.buffer.append(wkt.write(ls));
    }
}
