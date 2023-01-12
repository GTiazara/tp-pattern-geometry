package org.acme.geometry;



public class WktWriter {

    public String write(Geometry geom)
    {
        if (geom instanceof Point)
        {
            Point p = (Point) geom;
            return ("POINT(" + p.getCoordinate().getX() + " " +  p.getCoordinate().getY() + ")");
        }
        else if ( geom instanceof LineString)
        {
            LineString ls = (LineString) geom;
            String pointCoord= "";
            for(int i= 0; i< ls.getNumPoints(); i++)
            {
                if (i != ls.getNumPoints() - 1)
                {
                    Point p =  ls.getPointN(i);
                    pointCoord += p.getCoordinate().getX() + " " +  p.getCoordinate().getY() + "," ;
                }
                else
                {
                    Point p =  ls.getPointN(i);
                    pointCoord += p.getCoordinate().getX() + " " +  p.getCoordinate().getY() ;
                }

            }

            //System.out.println("LINESTRING(" + pointCoord +  ")");


            return ("LINESTRING(" + pointCoord +  ")");
        }
        else return ("Empty");
    }
}
