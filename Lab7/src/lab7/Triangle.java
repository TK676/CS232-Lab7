package lab7;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(int x, int y, int z, double base, double height) {
        super(x, y, z);
        this.base = base;
        this.height = height;
    }
 
    public double getBase() {
        return base;
    }
 
    public void setBase(double base) {
        this.base = base;
    }
 
    public double getHeight() {
        return height;
    }
 
    public void setHeight(double height) {
        this.height = height;
    }
 
    @Override
    public double area() {
        return base * height / 2;
    }
 
    @Override
    public String toString() {
        return super.toString() + "\nBase: " + base + "\nHeight: " + height + "\nArea of Triangle: " + area() + "\n";
    }
}