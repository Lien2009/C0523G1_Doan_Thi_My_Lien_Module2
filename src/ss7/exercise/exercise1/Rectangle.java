package ss7.exercise.exercise1;

public class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double length = 1.0;
    public  Rectangle(){

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
    @Override
    public void resize(double percent) {
        setWidth(width*(1+percent));
        setLength(length*(1+percent));
    }
}
