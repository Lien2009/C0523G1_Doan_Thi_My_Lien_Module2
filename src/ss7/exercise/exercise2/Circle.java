package ss7.exercise.exercise2;

public class Circle extends Shape {
    public double radius;

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

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
    @Override
    public String toString() {
        return "A Circle with radius = " + this.radius + ", Which is a subclas of " + super.toString();
    }
}
