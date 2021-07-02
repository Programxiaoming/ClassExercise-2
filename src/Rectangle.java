/*
Rectangle class
 */
public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    @Override
    public double getArea(){
        return width * length;
    }

    @Override
    public double getPerimeters(){
        return length * 2 + width * 2;
    }

    @Override
    public String toString(){
        return "The length and width of rectangle is " + length + " and " + width + super.toString();
    }
}