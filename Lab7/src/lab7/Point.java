package lab7;

public class Point {
    private int x;
    private int y;
    private int z;
 
    public Point() {
        x = 0;
        y = 0;
        z = 0;
    }
 
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
 
    public int getX() {
        return x;
    }
 
    public void setX(int x) {
        this.x = x;
    }
 
    public int getY() {
        return y;
    }
 
    public void setY(int y) {
        this.y = y;
    }
 
    public int getZ() {
        return z;
    }
 
    public void setZ(int z) {
        this.z = z;
    }
 
    @Override
    public String toString() {
        return "Center: (" + x + ", " + y + ", " + z + ") ";
    }
}