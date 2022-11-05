package lab7;

public class Circle extends Shape {
    private double radius;
 
    public Circle(int x, int y, int z, double radius) {
        super(x, y, z);
        this.radius = radius;
    }
 
    public double getRadius() {
        return radius;
    }
 
    public void setRadius(double radius) {
        this.radius = radius;
    }
 
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
 
    @Override
    public String toString() {
        return super.toString() + "\nRadius: " + radius + "\nArea of Circle: " + area() + "\n";
    }
}