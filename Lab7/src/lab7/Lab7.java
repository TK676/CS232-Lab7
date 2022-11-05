package lab7;

import java.util.ArrayList;
 
public class Lab7 {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        
        shapes.add(new Circle(4, 5, 6, 20));
        shapes.add(new Triangle(2, 3, 4, 5, 6));
        shapes.add(new Rectangle(4, 5, 7, 23, 20));
 
        for(Shape s: shapes) {
            System.out.println(s);
        }
    }
}