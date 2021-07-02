/*
Square class
 */

public class Square extends Rectangle{

    public Square(){
    }

    public Square(double side){
        this.setLength(side);
        this.setWidth(side);
    }

    public Square(double side, String color, boolean filled){
        super(color,filled,side,side);
    }

    public double getSide(){
        return getLength();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString(){
        return "The side length of square is " + getSide();
    }

    @Override
    public void setWidth(double width){
        super.setLength(width);
        super.setWidth(width);
    }

    @Override
    public void setLength(double length){
        super.setLength(length);
        super.setWidth(length);
    }
}