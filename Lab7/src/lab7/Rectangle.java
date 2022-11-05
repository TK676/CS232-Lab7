package lab7;

public class Rectangle extends Shape {
    private double width;
    private double height;
 
    public Rectangle(int x, int y, int z, double width, double height) {
        super(x, y, z);
        this.width = width;
        this.height = height;
    }
 
    public double getWidth() {
        return width;
    }
 
    public void setWidth(double width) {
        this.width = width;
    }
 
    public double getHeight() {
        return height;
    }
 
    public void setHeight(double height) {
        this.height = height;
    }
 
    @Override
    public double area() {
        return height * width;
    }
 
    @Override
    public String toString() {
        return super.toString() + "\nHeight: " + height + "\nWidth: " + width + "\nArea of Rectangle: " + area();
    }
}