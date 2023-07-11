package ss5.exercise.exercise1;

public class Circle {
    private double radius  = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius * 2 * Math.PI;
    }
}
