/*
Test and print results
 */

import java.awt.geom.Area;

public class TestShape {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(10);
        Circle c3 = new Circle("red", false, 5);
        System.out.println(c1.toString() + ", the area is " + c1.getArea() + ", the perimeter is " + c1.getPerimeters());
        System.out.println(c2.toString() + ", the area is " + c2.getArea() + ", the perimeter is " + c2.getPerimeters());
        System.out.println(c3.toString() + ", the area is " + c3.getArea() + ", the perimeter is " + c3.getPerimeters());
        System.out.println("==========================================================");
        System.out.println();

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3.5,6.5);
        Rectangle r3 = new Rectangle("black", false, 10, 15);
        System.out.println(r1.toString() + ", the area is " + r1.getArea() + ", the perimeter is " + r1.getPerimeters());
        System.out.println(r2.toString() + ", the area is " + r2.getArea() + ", the perimeter is " + r2.getPerimeters());
        System.out.println(r3.toString() + ", the area is " + r3.getArea() + ", the perimeter is " + r3.getPerimeters());
        System.out.println("==========================================================");
        System.out.println();

        Square s1 = new Square();
        Square s2 = new Square(2);
        Square s3 = new Square(10, "yellow",false);
        System.out.println(s1.toString() + ", the area is " + s1.getArea() + ", the perimeter is " + s1.getPerimeters());
        System.out.println(s2.toString() + ", the area is " + s2.getArea() + ", the perimeter is " + s2.getPerimeters());
        System.out.println(s3.toString() + ", the area is " + s3.getArea() + ", the perimeter is " + s3.getPerimeters());
        System.out.println("==========================================================");
        System.out.println();
    }
}
