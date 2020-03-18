package primitives;

public class Vector {
    Point3D head;

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

    public Vector(Point3D head)
            throws IllegalArgumentException{
        this.head = head;
    }
    public Vector(Coordinate x,Coordinate y, Coordinate z)
            throws IllegalArgumentException{
        this.head = new Point3D(x,y,z);
    }
    public Vector(double x,double y, double z)
            throws IllegalArgumentException {
        this.head = new Point3D(x,y,z);
    }
    // pas de throws ici
    public Vector(Vector other) {
        if(! (other == null))
            this.head = other.head;

    }

    public Point3D gethead() {
        return head;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o==null) return false;
        if (!(o instanceof Vector)) return false;
        Vector vector = (Vector) o;
        return this.head.equals(vector.head);
    }
    @Override
    public String toString() {
        return "Vector{" +
                "head=" + head.toString() +
                '}';
    }

}
