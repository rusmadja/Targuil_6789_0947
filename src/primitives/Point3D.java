package primitives;

import java.util.Objects;

public class Point3D
{

    Coordinate x,y,z;
    //il demande un static qui comporte le point (0,0,0) je pense c une erreur

    public Vector subtract (Point3D other)
    {
        //a modifier aucun calcule n,a etait fait
        return new Vector(2,3,2);
    }
    public double distanceSquared(Point3D other)
    {
        return 0;
    }
    public double distance(Point3D other)
    {
        return 0;
    }


    public Point3D(Coordinate x, Coordinate y, Coordinate z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point3D(double x, double y, double z)
    {
        this.x =new Coordinate(x);
        this.y =new Coordinate(y);
        this.z =new Coordinate(z);
    }
    public Point3D(Point3D other)
    {
        this.x = other.x;
        this.y = other.y;
        this.z = other.z;
    }

    public Coordinate getX() {
        return x;
    }

    public Coordinate getY() {
        return y;
    }

    public Coordinate getZ() {
        return z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (!(o instanceof Point3D)) return false;
        Point3D point3D = (Point3D) o;
        return Objects.equals(getX(), point3D.getX()) &&
                Objects.equals(getY(), point3D.getY()) &&
                Objects.equals(getZ(), point3D.getZ());
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "(x=" + x +
                ", y=" + y +
                ", z=" + z +
                ")}";
    }
}
