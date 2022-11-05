package lab7;

public abstract class Shape {
    private Point center;

    public Shape(int x,int y, int z) {
        this.center= new Point(x, y, z);
    }
 
    public abstract double area();
 
    @Override
    public String toString() {
        return center.toString();
    }
}