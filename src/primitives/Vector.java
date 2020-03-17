package primitives;

public class Vector {
    Point3D finishPoint;

    public Vector subtract(Vector other)
    {
        return new Vector(2,3,5);
    }
    public Vector add(Vector other)
    {
        return new Vector(2,3,5);
    }
    public Vector scale(Vector other)
    {
        return new Vector(2,3,5);
    }
    public double dotProduct(Vector other){return 0;}
    public double crossProduct(Vector other){return 0;}
    public double lengthSquared(){return  0;}
    public double length(){return  0;}
    public Vector  normalize(){return this;}
    public Vector  normalized(){return this;}

    public Vector(Point3D finishPoint)
            throws IllegalArgumentException{
        this.finishPoint = finishPoint;
    }
    public Vector(Coordinate x,Coordinate y, Coordinate z)
            throws IllegalArgumentException{
        this.finishPoint = new Point3D(x,y,z);
    }
    public Vector(double x,double y, double z)
            throws IllegalArgumentException {
        this.finishPoint = new Point3D(x,y,z);
    }
    // pas de throws ici
    public Vector(Vector other) {
        if(! (other == null))
            this.finishPoint = other.finishPoint;

    }

    public Point3D getFinishPoint() {
        return finishPoint;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o==null) return false;
        if (!(o instanceof Vector)) return false;
        Vector vector = (Vector) o;
        return this.finishPoint.equals(vector.finishPoint);
    }
    @Override
    public String toString() {
        return "Vector{" +
                "finishPoint=" + finishPoint.toString() +
                '}';
    }

}
