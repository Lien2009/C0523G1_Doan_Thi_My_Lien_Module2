package ss6.exercise.exercise1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}' + super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(5);
        System.out.println(cylinder.toString());
        cylinder.setRadius(2);
        cylinder.setColor("blue");
        System.out.println(cylinder.toString());
        System.out.println(cylinder.getVolume());
    }
}
