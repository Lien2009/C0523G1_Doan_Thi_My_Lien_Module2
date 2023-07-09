package ss6.practice;

public class Rectangle extends Shape {
    private double width;
    private double length;
    public  Rectangle(){
        this(1.0,1.0);
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return (this.width+this.length)*2;
    }
    public double getPerimeter(){
        return this.width*this.length;
    }
    public String toString() {
        return "A Rectangle with width = "+this.width+" and length = "+this.length+", Which is a subclass of "+ super.toString();
    }
}
