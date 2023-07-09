package ss6.practice;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getAre() {
        return radius * 2 * Math.PI;
    }

    public double getPerimeter() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public String toString() {
        return "A Circle with radius = " + this.radius + ", Which is a subclas of " + super.toString();
    }
}
