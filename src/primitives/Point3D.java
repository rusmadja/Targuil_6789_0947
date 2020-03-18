package primitives;

import java.util.Objects;


public class Point3D
{
    /**
     * @param x = coordinate on the axis X
     * @param y = coordinate on the axis X
     * @param z = coordinate on the axis X
     */
    Coordinate x;
    Coordinate y;
    Coordinate z;

    public final static Point3D ZERO = new Point3D(0.0,0.0,0.0);

    public Point3D add(Vector _vector)
    {
        return new Point3D(this.x._coord+  _vector.head.x._coord,
                            this.y._coord+ _vector.head.y._coord,
                            this.z._coord+ _vector.head.z._coord);
    }
    //verifier si c bienn ca substract
    public Vector subtract (Point3D other)
    {
        /*this.x - other.x*/ Coordinate v1 = new Coordinate( this.x._coord-other.x._coord);
        /*this.y - other.y*/ Coordinate v2 = new Coordinate(this.y._coord-other.y._coord);
        /*this.z - other.z*/ Coordinate v3 = new Coordinate(this.z._coord-other.z._coord);
        return new Vector(v1,v2,v3);
    }
    public double distanceSquared(Point3D other)
    {
        //[(Xa-Xb)²+(Ya-Yb)²+(Za-Zb)²]
        return ((this.x._coord-other.x._coord)*(this.x._coord-other.x._coord)
                +(this.y._coord-other.y._coord)*(this.y._coord-other.y._coord)
                +(this.z._coord-other.z._coord)*(this.z._coord-other.z._coord));
    }
    public double distance(Point3D other)
    {
        return Math.sqrt(distanceSquared(other));
    }


    public Point3D(Coordinate x, Coordinate y, Coordinate z)
    {
        this.x = new Coordinate(x._coord);
        this.y = new Coordinate(y._coord);
        this.z = new Coordinate(z._coord);
    }
    public Point3D(double x, double y, double z)
    {
       this(new Coordinate(x),
            new Coordinate(y),
            new Coordinate(z));
    }
    public Point3D(Point3D other)
    {
        this(other.x._coord ,other.y._coord,other.z._coord);
    }

    public Coordinate getX() {
        return new Coordinate(x._coord);
    }

    public Coordinate getY() {
        return new Coordinate(y._coord);
    }

    public Coordinate getZ() {
        return new Coordinate(z._coord);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (!(o instanceof Point3D)) return false;
        Point3D point3D = (Point3D) o;
        return this.x.equals(point3D.getX()) &&
                this.y.equals(point3D.getY()) &&
                this.z.equals(point3D.getZ());
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "(x=" + x.toString() +
                ", y=" + y.toString() +
                ", z=" + z.toString() +
                ")}";
    }
}
