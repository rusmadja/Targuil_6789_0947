package primitives;
import java.lang.Math;

public class Vector {
    Point3D head;

    public Vector subtract(Vector other)
    {
        return new Vector(other.finishPoint.x._coord-this.finishPoint.x._coord,
                other.finishPoint.y._coord-this.finishPoint.y._coord,
                other.finishPoint.z._coord-this.finishPoint.z._coord);
    }
    public Vector add(Vector other)
    {
        return new Vector(this.finishPoint.x._coord + other.finishPoint.x._coord,
                this.finishPoint.y._coord + other.finishPoint.y._coord,
                this.finishPoint.z._coord + other.finishPoint.z._coord);
    }
    public Vector scale(int a)
    {
        return new Vector(this.finishPoint.x._coord*a,
                this.finishPoint.y._coord*a,
                this.finishPoint.z._coord*a);
    }

    public double dotProduct(Vector other){
        return (this.finishPoint.x._coord * other.finishPoint.x._coord +
         this.finishPoint.y._coord * other.finishPoint.y._coord +
         this.finishPoint.z._coord * other.finishPoint.z._coord );
    }

    public Vector crossProduct(Vector other){
        return new Vector( this.finishPoint.y._coord * other.finishPoint.z._coord - this.finishPoint.z._coord * other.finishPoint.y._coord ,
        this.finishPoint.z._coord * other.finishPoint.x._coord - this.finishPoint.x._coord * other.finishPoint.z._coord ,
         this.finishPoint.x._coord * other.finishPoint.y._coord - this.finishPoint.y._coord * other.finishPoint.x._coord );
    }
    public double lengthSquared(){
        return  Math.sqrt(
                Math.pow(this.finishPoint.x._coord,2)+
                Math.pow(this.finishPoint.y._coord,2)+
                Math.pow(this.finishPoint.z._coord,2));
    }
    public double length(){
        return  Math.sqrt(
                        Math.pow(this.finishPoint.x._coord,2)+
                        Math.pow(this.finishPoint.y._coord,2)+
                        Math.pow(this.finishPoint.z._coord,2));
    }
    public Vector  normalize(){
        return this;
    }
    public Vector  normalized(){
        return this;
    }

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
