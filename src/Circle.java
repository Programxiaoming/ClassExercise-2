/*
Circle class
 */
public class Circle extends Shape{
    private double radius;
    public Circle(){
        this.radius = 1.0;
        }

        public Circle(double radius){
        this.radius = radius;
        }

        public Circle(String color, boolean filled, double radius){
        super(color,filled);
        this.radius = radius;
        }

        public double getRadius(){
        return radius;
        }

        public void setRadius(double radius){
        this.radius = radius;
        }

        @Override
        public double getArea(){
        return radius * radius * 3.14159;
        }

        @Override
        public double getPerimeters(){
        return radius * 2 * 3.14159;
        }

        @Override
        public String toString(){
        return "The radius of circle is " + radius + super.toString();
        }

    }