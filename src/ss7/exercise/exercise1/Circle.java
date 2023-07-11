package ss7.exercise.exercise1;

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
        return radius * 2 * Math.PI;
    }

    public double getPerimeter() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + this.radius + ", Which is a subclas of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        setRadius(radius * (1 + percent));
    }
}
