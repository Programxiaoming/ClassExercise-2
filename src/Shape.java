/*
Shape abstract class
 */

public abstract class Shape{
    private boolean filled;
    private String color;
    public Shape(){
        this.filled = true;
        this.color = "blue";

    }

    public Shape (String color, boolean filled){
        this.filled = filled;
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString(){
        String result;
        if(isFilled())result = ", and the Shape is filled by color " + color;
        else result = ", and the shape is filled by color " + color;
        return  result;
    }

    public abstract double getArea();
    public abstract double getPerimeters();

}